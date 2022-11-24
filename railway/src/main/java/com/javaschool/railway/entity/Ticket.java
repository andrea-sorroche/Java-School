package com.javaschool.railway.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private Integer passenger_id;

    private Integer train_id;

    private java.sql.Date departure_date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="passenger_id",insertable = false, updatable = false)
    private Passenger passenger;

    @OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL)
    private Collection<UserTicket> user_tickets;

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

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Collection<UserTicket> getUserTickets() {
        return user_tickets;
    }

    public void setUserTickets(Collection<UserTicket> user_tickets) {
        this.user_tickets = user_tickets;
    }
}

