package com.javaschool.railway.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class RoutePart {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private Integer price;

    private java.sql.Date time_passing;

    @OneToMany(mappedBy = "route_part", cascade = CascadeType.ALL)
    private Collection<RouteConnection> route_connections;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="station_from",insertable = false, updatable = false)
    private Station station_from;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="station_to",insertable = false, updatable = false)
    private Station station_to;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Station getStationFrom() {
        return station_from;
    }

    public void setStationFrom(Station station_from) {
        this.station_from = station_from;
    }

    public Station getStationTo() {
        return station_to;
    }

    public void setStationTo(Station station_to) {
        this.station_to = station_to;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public java.sql.Date getTimePassing() {
        return time_passing;
    }

    public void setTimePassing(java.sql.Date time_passing) {
        this.time_passing = time_passing;
    }

    public Collection<RouteConnection> getRouteConnections() {
        return route_connections;
    }

    public void setRouteConnections(Collection<RouteConnection> route_connections) {
        this.route_connections = route_connections;
    }

}
