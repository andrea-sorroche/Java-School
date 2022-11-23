package com.javaschool.railway.entity;

import javax.persistence.*;

@Entity
public class UserTicket {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private Integer user_id;

    private Integer ticket_id;

    private java.sql.Date payment_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return user_id;
    }

    public void setUserId(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getTicketId() {
        return ticket_id;
    }

    public void setTicketId(Integer role_id) {
        this.ticket_id = ticket_id;
    }

    public java.sql.Date getPaymentTime() {
        return payment_time;
    }

    public void setPaymentTime(java.sql.Date payment_time) {
        this.payment_time = payment_time;
    }
}