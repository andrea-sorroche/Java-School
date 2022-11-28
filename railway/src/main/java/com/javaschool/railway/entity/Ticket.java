package com.javaschool.railway.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "passenger_id")
    private Integer passengerId;

    @Column(name = "train_id")
    private Integer trainId;

    @Column(name = "departure_date")
    private java.sql.Date departureDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="passenger_id",insertable = false, updatable = false)
    private Passenger passenger;

    @OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL)
    private Collection<UserTicket> userTickets;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="train_id",insertable = false, updatable = false)
    private Train train;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Integer passengerId) {
        this.passengerId = passengerId;
    }

    public Integer getTrainId() {
        return trainId;
    }

    public void setTrainId(Integer trainId) {
        this.trainId = trainId;
    }

    public java.sql.Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(java.sql.Date departureDate) {
        this.departureDate = departureDate;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Collection<UserTicket> getUserTickets() {
        return userTickets;
    }

    public void setUserTickets(Collection<UserTicket> userTickets) {
        this.userTickets = userTickets;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }
}

