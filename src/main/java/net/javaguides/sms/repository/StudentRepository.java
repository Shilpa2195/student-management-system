package net.javaguides.sms.repository;

import net.javaguides.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

//jpaRepository has two parameters, first one is type of JPA entity and second one is type of primary key
// We don't need to add @Repository annotation seperately here for StudentRepository ,
// because JpaRepository has implementation class of SimpleJpaRepository which already has @Repository.
// Same thing with @transaction annotation
public interface StudentRepository extends JpaRepository<Student,Long> {

}
