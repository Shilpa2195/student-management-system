package net.javaguides.sms.entity;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Table;

import jakarta.persistence.*;

//we can make simple java class Student as JPA entity by using JPA annotation @Entity
@Entity
//And we are going to map this entity to database tables , here we are using @Table annotation to provide table related details
// If we don't specify @Table and @column annotation, then JPA will add it by giving table name as class name and column name as field name
@Table(name= "students")
public class Student {
//    to add primary key for the table "students" we will use @ID annotation
//    inorder to use primary key startergy we are going to use @GenerateValue annotation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    map column names for below fields by using @Column annotation
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    //default constructor is needed because hibernate uses internally proxies to create objects dynamically
    public Student() {

    }
    public Student(String firstName, String lastName, String email) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
