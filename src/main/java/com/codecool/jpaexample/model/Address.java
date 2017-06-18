package com.codecool.jpaexample.model;

import javax.persistence.*;



@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String country;
    @Column(name = "Zip", length = 4, unique=true, nullable=false)
    private String zipcode;
    private String city;
    private String addr;
    @OneToOne
    private Student student;
    @Enumerated(EnumType.STRING)
    private CCLocation ccLocation;


    public Address() {
    }

    public Address(String country, String zipcode, String city, String addr, Student student, CCLocation ccLocation) {
        this.country = country;
        this.zipcode = zipcode;
        this.city = city;
        this.addr = addr;
        this.student = student;
        this.ccLocation = ccLocation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Address(CCLocation ccLocation) {
        this.ccLocation = ccLocation;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", city='" + city + '\'' +
                ", addr='" + addr + '\'' +
                ", student='" + student + '\''+
                ", location='" + ccLocation + '\''+
                '}';
    }

}
