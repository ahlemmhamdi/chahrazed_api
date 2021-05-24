package tn.alfacomputers.entities;

import org.hibernate.annotations.Table;

import javax.persistence.*;

@Entity
@Table(appliesTo = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name="ArrivalDate")
    private String ArrivalDate;

    @Column(name="DepartureDate")
    private String DepartureDate;

    @Column(name="total")
    private double total;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

    public Reservation() {

    }

    public Reservation(Integer id, String arrivalDate, String departureDate, double total, User user, Room room) {
        this.id = id;
        ArrivalDate = arrivalDate;
        DepartureDate = departureDate;
        this.total = total;
        this.user = user;
        this.room = room;
    }

    public Integer getId() {
        return id;
    }

    public String getArrivalDate() {
        return ArrivalDate;
    }

    public String getDepartureDate() {
        return DepartureDate;
    }

    public double getTotal() {
        return total;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setArrivalDate(String arrivalDate) {
        ArrivalDate = arrivalDate;
    }

    public void setDepartureDate(String departureDate) {
        DepartureDate = departureDate;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}


