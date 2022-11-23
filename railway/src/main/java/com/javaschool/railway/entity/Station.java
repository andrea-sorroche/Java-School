package com.javaschool.railway.entity;

import javax.persistence.*;

@Entity
public class Station {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    private java.sql.Date stop_duration;

    private Boolean closed;

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
}
