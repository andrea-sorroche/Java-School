package com.javaschool.railway.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class RoutePart {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "price")
    private Integer price;

    @Column(name = "time_passing")
    private java.sql.Time timePassing;

    @OneToMany(mappedBy = "routePart", cascade = CascadeType.ALL)
    private Collection<RouteConnection> routeConnections;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="station_from",insertable = false, updatable = false)
    private Station stationFrom;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="station_to",insertable = false, updatable = false)
    private Station stationTo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Station getStationFrom() {
        return stationFrom;
    }

    public void setStationFrom(Station stationFrom) {
        this.stationFrom = stationFrom;
    }

    public Station getStationTo() {
        return stationTo;
    }

    public void setStationTo(Station stationTo) {
        this.stationTo = stationTo;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public java.sql.Time getTimePassing() {
        return timePassing;
    }

    public void setTimePassing(java.sql.Time timePassing) {
        this.timePassing = timePassing;
    }

    public Collection<RouteConnection> getRouteConnections() {
        return routeConnections;
    }

    public void setRouteConnections(Collection<RouteConnection> routeConnections) {
        this.routeConnections = routeConnections;
    }

}
