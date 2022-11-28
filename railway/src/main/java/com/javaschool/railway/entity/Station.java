package com.javaschool.railway.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Station {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "stop_duration")
    private java.sql.Time stopDuration;

    @Column(name = "closed")
    private Boolean closed;

    @OneToMany(mappedBy = "stationFrom", cascade = CascadeType.ALL)
    private Collection<RoutePart> routePartsFrom;

    @OneToMany(mappedBy = "stationTo", cascade = CascadeType.ALL)
    private Collection<RoutePart> routePartsTo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.sql.Time getStopDuration() {
        return stopDuration;
    }

    public void setStopDuration(java.sql.Time stopDuration) {
        this.stopDuration = stopDuration;
    }

    public Boolean isClosed() {
        return closed;
    }

    public void setClosed(Boolean isClosed) {
        this.closed = isClosed;
    }

    public Collection<RoutePart> getRoutePartsFrom() {
        return routePartsFrom;
    }

    public void setRoutePartsFrom(Collection<RoutePart> routePartsFrom) {
        this.routePartsFrom = routePartsFrom;
    }

    public Collection<RoutePart> getRoutePartsTo() {
        return routePartsTo;
    }

    public void setRoutePartsTo(Collection<RoutePart> routePartsTo) {
        this.routePartsTo = routePartsTo;
    }
}


