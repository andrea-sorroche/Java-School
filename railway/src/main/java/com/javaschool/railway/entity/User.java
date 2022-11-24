package com.javaschool.railway.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String login;

    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Collection<UserRole> user_roles;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Collection<UserTicket> user_tickets;

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
        return user_roles;
    }

    public void setUserRoles(Collection<UserRole> user_roles) {
        this.user_roles = user_roles;
    }

    public Collection<UserTicket> getUserTickets() {
        return user_tickets;
    }

    public void setUserTickets(Collection<UserTicket> user_tickets) {
        this.user_tickets = user_tickets;
    }

}