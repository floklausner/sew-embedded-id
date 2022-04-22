package at.htl.sew.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RegistrationId implements Serializable {

    private Long vehicleId;
    private Long personId;

    public RegistrationId() {
    }

    public RegistrationId(Long vehicleId, Long personId) {
        this.vehicleId = vehicleId;
        this.personId = personId;
    }

    //region Getter & Setter

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    //endregion

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegistrationId that = (RegistrationId) o;
        return vehicleId.equals(that.vehicleId) && personId.equals(that.personId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleId, personId);
    }
}
