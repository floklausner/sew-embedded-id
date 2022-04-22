package at.htl.sew.control;

import at.htl.sew.entity.Vehicle;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VehicleRepository implements PanacheRepository<Vehicle> {

}
