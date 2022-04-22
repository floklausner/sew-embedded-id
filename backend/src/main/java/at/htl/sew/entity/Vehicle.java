package at.htl.sew.entity;

import javax.persistence.*;

@Entity
@Table(name = "VEHICLE")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "BRAND")
    private String brand;
    @Column(name = "MODEL")
    private String model;
    @Column(name = "LASTNAME")
    private String lastname;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, String lastname) {
        this.brand = brand;
        this.model = model;
        this.lastname = lastname;
    }

    //region Getter & Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //endregion

    @Override
    public String toString() {
        return String.format("%d, %s %s",getId(),getBrand(),getModel());
    }
}
