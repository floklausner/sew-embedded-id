package at.htl.sew.control;

import at.htl.sew.entity.Registration;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RegistrationRepository implements PanacheRepository<Registration> {

}
