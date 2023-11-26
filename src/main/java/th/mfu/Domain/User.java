package th.mfu.Domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String name;

     // One User can have one Station
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Station station;

    // One User can make one Booking
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Booking booking;

    // Many Users can belong to one Reststop
    @ManyToOne
    @JoinColumn(name = "reststop_id")
    
    private Reststop reststop;

    public Reststop getReststop() {
        return reststop;
    }

    public void setReststop(Reststop reststop) {
        this.reststop = reststop;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}