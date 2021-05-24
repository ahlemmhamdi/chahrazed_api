package tn.alfacomputers.entities;

import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(appliesTo = "room")
public class Room {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @Column(name="title")
    private String title;

    @Column(name="description" ,columnDefinition = "text")
    private String description;

    @Column(name="price")
    private double price;

    @Column(name="hotel")
    private String hotel;

    @Column(name="photo_url")
    private String photo_url;

    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Reservation> reservations;

    public Room(Long roomId) {
        this.id=roomId;
    }

    public String getPhoto_url() {
        return photo_url;
    }

    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
    }


    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getHotel() {
        return hotel;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }
}
