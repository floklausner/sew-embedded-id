package at.htl.sew;

import at.htl.sew.control.PersonRepository;
import at.htl.sew.control.RegistrationRepository;
import at.htl.sew.control.VehicleRepository;
import at.htl.sew.entity.Person;
import at.htl.sew.entity.Registration;
import at.htl.sew.entity.Vehicle;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.time.LocalDate;

@QuarkusTest
public class DatabaseTest {

//    @Inject
//    PersonRepository personRepository;
//
//    @Inject
//    VehicleRepository vehicleRepository;
//
//    @Inject
//    RegistrationRepository registrationRepository;
//
//    @Transactional
//    @Test
//    void createInstances() {
//        Person hans = new Person("Hans", "Huber");
//        Vehicle opel = new Vehicle("Opel", "Kapitaen");
//        Registration registration = new Registration(hans, opel, "ABC-123", LocalDate.now());
//        registrationRepository.persist(registration);
//    }
//
//    @Transactional
//    @Test
//    void createNew() {
//        Person florian = new Person("Florian", "Klausner");
//        Vehicle renault = new Vehicle("Renault", "Clio");
//        Registration registration = new Registration(florian, renault, "LL-931-PN", LocalDate.now());
//        registrationRepository.persist(registration);
//    }

}
