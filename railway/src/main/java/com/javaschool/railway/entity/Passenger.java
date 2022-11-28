package com.javaschool.railway.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Passenger {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "birth_date")
    private java.sql.Date birthDate;

    @Column(name = "mobile_phone")
    private String mobilePhone;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "passenger", cascade = CascadeType.ALL)
    private Collection<Ticket> tickets;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public java.sql.Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(java.sql.Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Collection<Ticket> getTickets() {
        return tickets; }

    public void setTickets(Collection<Ticket> tickets) {
        this.tickets = tickets; }
}