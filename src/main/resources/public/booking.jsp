<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Charging Station Booking</title>
    <!-- เพิ่ม CSS หรือ Bootstrap ตามต้องการ -->
</head>
<body>
    <h2>Book a Charging Slot</h2>
    <form action="BookingServlet" method="post">
        <label for="station">Select Station:</label>
        <select id="station" name="station">
            <option value="station1">Station 1</option>
            <option value="station2">Station 2</option>
            <!-- เพิ่มตัวเลือกตามสถานีที่มี -->
        </select>

        <label for="timeslot">Select Time Slot:</label>
        <select id="timeslot" name="timeslot">
            <option value="6:00-6:30">6:00 AM - 6:30 AM</option>
            <option value="6:30-7:00">6:30 AM - 7:00 AM</option>
            <!-- เพิ่มตัวเลือกตามช่วงเวลาที่มี -->
        </select>

        <button type="submit">Book Now</button>
    </form>
</body>
</html>
