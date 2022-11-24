package com.javaschool.railway.entity;

import javax.persistence.*;

@Entity
public class RouteConnection {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String route_part_id;

    private String route_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="route_id",insertable = false, updatable = false)
    private Route route;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="route_part_id",insertable = false, updatable = false)
    private RoutePart routePart;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoutePartId() {
        return route_part_id;
    }

    public void setRoutePartId(String route_part_id) {
        this.route_part_id = route_part_id;
    }

    public String getRouteId() {
        return route_id;
    }

    public void setRouteId(String route_id) {
        this.route_id = route_id;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public RoutePart getRoutePart() {
        return routePart;
    }

    public void setRoutePart(RoutePart routePart) {
        this.routePart = routePart;
    }
}