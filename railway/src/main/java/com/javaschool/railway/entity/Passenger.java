package com.javaschool.railway.entity;

import javax.persistence.*;

@Entity
public class Passenger {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String first_name;

    private String last_name;

    private java.sql.Date birth_date;

    private String mobile_phone;

    private String email;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public java.sql.Date getBirthDate() {
        return birth_date;
    }

    public void setBirthDate(java.sql.Date last_name) {
        this.birth_date = birth_date;
    }

    public String getMobilePhone() {
        return mobile_phone;
    }

    public void setMobilePhone(String mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}