package com.javaschool.railway.entity;

import javax.persistence.*;

@Entity
public class RoutePart {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private Integer station_from;

    private Integer station_to;

    private Integer price;

    private java.sql.Date time_passing;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStationFrom() {
        return station_from;
    }

    public void setStationFrom(Integer station_from) {
        this.station_from = station_from;
    }

    public Integer getStationTo() {
        return station_to;
    }

    public void setStationTo(Integer station_to) {
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


}
