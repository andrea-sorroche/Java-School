package com.javaschool.railway.entity;

import javax.persistence.*;

@Entity
public class RouteConnection {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "route_part_id")
    private Integer routePartId;

    @Column(name = "route_id")
    private Integer routeId;

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

    public Integer getRoutePartId() {
        return routePartId;
    }

    public void setRoutePartId(Integer routePartId) {
        this.routePartId = routePartId;
    }

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
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