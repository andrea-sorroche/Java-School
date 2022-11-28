package com.javaschool.railway.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Route {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @OneToMany(mappedBy = "route", cascade = CascadeType.ALL)
    private Collection<Train> trains;

    @OneToMany(mappedBy = "route", cascade = CascadeType.ALL)
    private Collection<RouteConnection> routeConnections;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Collection<Train> getTrains() {
        return trains;
    }

    public void setTrains(Collection<Train> trains) {
        this.trains = trains;
    }

    public Collection<RouteConnection> getRouteConnections() {
        return routeConnections;
    }

    public void setRouteConnections(Collection<RouteConnection> routeConnections) {
        this.routeConnections = routeConnections;
    }
}
