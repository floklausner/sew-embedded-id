package at.htl.sew.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "REGISTRATION")
public class Registration {

    @EmbeddedId
    private RegistrationId registrationId;

    @ManyToOne
    @MapsId("personId")
    private Person person;

    @ManyToOne
    @MapsId("vehicleId")
    private Vehicle vehicle;

    private String registrationPlate;
    private LocalDate startDate;
    private LocalDate endDate;

    public Registration() {
    }

    public Registration(Person person, Vehicle vehicle, String registrationPlate, LocalDate startDate) {
        this.person = person;
        this.vehicle = vehicle;
        this.registrationPlate = registrationPlate;
        this.startDate = startDate;
        this.registrationId = new RegistrationId(vehicle.getId(), person.getId());
    }

    //region Getter & Setter

    public RegistrationId getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(RegistrationId registrationId) {
        this.registrationId = registrationId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getRegistrationPlate() {
        return registrationPlate;
    }

    public void setRegistrationPlate(String registrationPlate) {
        this.registrationPlate = registrationPlate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    //endregion
}
