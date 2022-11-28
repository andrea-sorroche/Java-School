package com.javaschool.railway.entity;

import javax.persistence.*;

@Entity
public class UserRole {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "role_id")
    private Integer roleId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="role_id",insertable = false, updatable = false)
    private Role role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id",insertable = false, updatable = false)
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}