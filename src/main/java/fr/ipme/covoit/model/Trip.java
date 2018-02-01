package fr.ipme.covoit.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private double price;
    @OneToOne
    private City city_from;
    @OneToOne
    private City city_to;
    @OneToOne
    private Car car;
    @ManyToMany
    private List<User> passengerList;


    public Trip() {
    }

    public Trip(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public City getCity_from() {
        return city_from;
    }

    public void setCity_from(City city_from) {
        this.city_from = city_from;
    }

    public City getCity_to() {
        return city_to;
    }

    public void setCity_to(City city_to) {
        this.city_to = city_to;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<User> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<User> passengerList) {
        this.passengerList = passengerList;
    }
}
