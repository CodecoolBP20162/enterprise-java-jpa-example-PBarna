package com.codecool.jpaexample.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyColumn;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String email;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @Transient
    private long age;

    @OneToOne
    private Address address;

    @ElementCollection
    @CollectionTable(name="Phone")
    @MapKeyColumn(name="PHONE_TYPE")
    @Column(name="PHONE_NUM")
    private Map<String, String> phoneNumbers;

    public Student() {
    }

    public Student(String name, String email, Date dateOfBirth) { //, Map<String, String> phoneNumbers) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.age = (Calendar.getInstance().getTimeInMillis() - dateOfBirth.getTime())
                / (60L * 60L * 1000L * 24L * 365L);
        this.phoneNumbers = phoneNumbers;
    }

    public Student(String name, String email, Date dateOfBirth,  Address address) {
        this(name, email, dateOfBirth); //, phoneNumbers);
        this.address = address;
    }

    public Student(Map<String, String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Map<String, String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Map<String, String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address id=" + address.getId() +
                '}';
    }

}
