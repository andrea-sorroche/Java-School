package com.javaschool.railway.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Route {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @OneToMany(mappedBy = "route", cascade = CascadeType.ALL)
    private Collection<Train> trains;

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
}
