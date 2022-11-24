package com.javaschool.railway.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private Collection<UserRole> user_roles;

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

    public Collection<UserRole> getUserRoles() {
        return user_roles;
    }

    public void setUserRoles(Collection<UserRole> user_roles) {
        this.user_roles = user_roles;
    }
}
