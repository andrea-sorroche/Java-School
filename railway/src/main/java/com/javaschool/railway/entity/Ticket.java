package com.javaschool.railway.entity;

import javax.persistence.*;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private Integer passenger_id;

    private Integer train_id;

    private java.sql.Date departure_date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPassengerId() {
        return passenger_id;
    }

    public void setPassengerId(Integer passenger_id) {
        this.passenger_id = passenger_id;
    }

    public Integer getTrainId() {
        return train_id;
    }

    public void setTrainId(Integer train_id) {
        this.train_id = train_id;
    }

    public java.sql.Date getDepartureDate() {
        return departure_date;
    }

    public void setDepartureDate(java.sql.Date departure_date) {
        this.departure_date = departure_date;
    }
}
