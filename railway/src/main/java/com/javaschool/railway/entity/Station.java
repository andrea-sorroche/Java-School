package com.javaschool.railway.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Station {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    private java.sql.Date stop_duration;

    private Boolean closed;

    @OneToMany(mappedBy = "stationfrom", cascade = CascadeType.ALL)
    private Collection<RoutePart> route_parts_from;

    @OneToMany(mappedBy = "stationto", cascade = CascadeType.ALL)
    private Collection<RoutePart> route_parts_to;

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

    public java.sql.Date getStopDuration() {
        return stop_duration;
    }

    public void setStopDuration(java.sql.Date stop_duration) {
        this.stop_duration = stop_duration;
    }

    public Boolean isClosed() {
        return closed;
    }

    public void setClosed(Boolean isClosed) {
        this.closed = isClosed;
    }

    public Collection<RoutePart> getRoute_parts_from() {
        return route_parts_from;
    }

    public void setRoute_parts_from(Collection<RoutePart> route_parts_from) {
        this.route_parts_from = route_parts_from;
    }

    public Collection<RoutePart> getRoute_parts_to() {
        return route_parts_to;
    }

    public void setRoute_parts_to(Collection<RoutePart> route_parts_to) {
        this.route_parts_to = route_parts_to;
    }
}


