package com.javaschool.railway.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Collection<UserRole> userRoles;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Collection<UserTicket> userTickets;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Collection<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

    public Collection<UserTicket> getUserTickets() {
        return userTickets;
    }

    public void setUserTickets(Collection<UserTicket> userTickets) {
        this.userTickets = userTickets;
    }

}