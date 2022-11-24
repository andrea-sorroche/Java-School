package com.javaschool.railway.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Train {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String number;

    private Integer count_of_seats;

    private Boolean cancelled;

    private Integer route_id;

    private java.sql.Date departure_time;

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
        return count_of_seats;
    }

    public void setCountOfSeats(Integer count_of_seats) {
        this.count_of_seats = count_of_seats;
    }

    public Boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(Boolean isCancelled) {
        this.cancelled = isCancelled;
    }

    public Integer getRouteId() {
        return route_id;
    }

    public void setRoute(Integer route_id) {
        this.route_id = route_id;
    }

    public java.sql.Date getDepartureTime() {
        return departure_time;
    }

    public void setDepartureTime(java.sql.Date departure_time) {
        this.departure_time = departure_time;
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