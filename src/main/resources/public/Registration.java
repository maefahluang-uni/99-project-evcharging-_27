import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Registration {

    // เมธอดลงทะเบียนผู้ใช้
    public void registerUser(String username, String email, String password) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // กำหนดค่าเชื่อมต่อฐานข้อมูล MySQL
            String url = "jdbc:mysql://localhost:3306/register_ev";
            String dbUsername = "ชื่อผู้ใช้";
            String dbPassword = "รหัสผ่าน";

            // เชื่อมต่อกับฐานข้อมูล
            conn = DriverManager.getConnection(url, dbUsername, dbPassword);

            // ตรวจสอบว่า username หรือ email มีอยู่ในระบบแล้วหรือไม่
            String userCheckQuery = "SELECT * FROM user WHERE username = ? OR email = ?";
            preparedStatement = conn.prepareStatement(userCheckQuery);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                if (resultSet.getString("username").equals(username)) {
                    System.out.println("Username already exists");
                }
                if (resultSet.getString("email").equals(email)) {
                    System.out.println("Email already exists");
                }
            } else {
                // ถ้าไม่มีข้อผิดพลาด ทำการลงทะเบียนผู้ใช้ใหม่
                String insertUserQuery = "INSERT INTO user(username, email, password) VALUES(?, ?, ?)";
                preparedStatement = conn.prepareStatement(insertUserQuery);
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, email);
                preparedStatement.setString(3, hashPassword(password)); // ใช้เมธอดเข้ารหัสรหัสผ่าน

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("User registered successfully");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // ปิดทุก resource ที่เปิด
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // เมธอดเข้ารหัสรหัสผ่าน
    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());

            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        // สร้าง instance ของ Registration
        Registration registration = new Registration();

        // เรียกใช้เมธอด registerUser ใน Registration
        registration.registerUser("user123", "user123@example.com", "password123");
    }
}
