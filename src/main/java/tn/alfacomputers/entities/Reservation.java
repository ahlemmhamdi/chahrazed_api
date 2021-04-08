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


