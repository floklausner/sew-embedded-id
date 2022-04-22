package at.htl.sew.control;

import at.htl.sew.entity.Person;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonRepository implements PanacheRepository<Person> {

}
