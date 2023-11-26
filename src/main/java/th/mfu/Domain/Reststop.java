package th.mfu.Domain;


import javax.persistence.*;
import java.util.*;



@Entity
@Table(name = "RestStops")
public class Reststop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long restStopId;

    private String name;
    private String shop;
    private String location;
    private String time;

    // One Reststop can have many Users
    @OneToMany(mappedBy = "reststop", cascade = CascadeType.ALL)
    private List<User> users;


    // Other rest stop fields and relationships

    public Reststop() {
        // Default constructor
    }

    public Reststop(String name, String location) {
        this.name = name;
        this.location = location;
        // Other fields can be initialized here if needed
    }

    // Getters and setters

    public Long getRestStopId() {
        return restStopId;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setRestStopId(Long restStopId) {
        this.restStopId = restStopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    // Other getters and setters for additional fields and relationships
}