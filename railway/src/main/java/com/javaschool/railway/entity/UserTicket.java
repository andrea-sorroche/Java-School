package com.javaschool.railway.entity;

import javax.persistence.*;

@Entity
public class UserTicket {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "ticket_id")
    private Integer ticketId;

    @Column(name = "payment_time")
    private java.sql.Date paymentTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id",insertable = false, updatable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ticket_id",insertable = false, updatable = false)
    private Ticket ticket;



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

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public java.sql.Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(java.sql.Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}