package fr.ipme.covoit.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;

@Entity
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Car {

    @Id
    @GeneratedValue
    @JsonView(View.Car.class)
    private int id;

    @Column
    @JsonView(View.Car.class)
    private Brand brand;

    @Column
    @JsonView(View.Car.class)
    private String model;

    @Column
    @JsonView(View.Car.class)
    private int numberOfPlaces;

    @ManyToOne
    @JsonView(View.Car.class)
    private User owner;

    public Car() {
    }

    public Car(int id, Brand brand, String model, int numberOfPlaces) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.numberOfPlaces = numberOfPlaces;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public void setNumberOfPlaces(int numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
