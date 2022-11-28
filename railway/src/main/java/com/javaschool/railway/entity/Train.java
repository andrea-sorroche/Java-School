package com.javaschool.railway.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Train {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "number")
    private String number;

    @Column(name = "count_of_seats")
    private Integer countOfSeats;

    @Column(name = "cancelled")
    private Boolean cancelled;

    @Column(name = "route_id")
    private Integer routeId;

    @Column(name = "departure_time")
    private java.sql.Time departureTime;

    @OneToMany(mappedBy = "train", cascade = CascadeType.ALL)
    private Collection<Ticket> tickets;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="route_id",insertable = false, updatable = false)
    private Route route;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCountOfSeats() {
        return countOfSeats;
    }

    public void setCountOfSeats(Integer countOfSeats) {
        this.countOfSeats = countOfSeats;
    }

    public Boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(Boolean isCancelled) {
        this.cancelled = isCancelled;
    }

    public Integer getRouteId() {
        return routeId;
    }

    public void setRoute(Integer routeId) {
        this.routeId = routeId;
    }

    public java.sql.Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(java.sql.Time departureTime) {
        this.departureTime = departureTime;
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Collection<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}