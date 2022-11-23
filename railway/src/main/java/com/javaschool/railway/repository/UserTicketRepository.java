package com.javaschool.railway.repository;

import com.javaschool.railway.entity.UserTicket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTicketRepository extends JpaRepository<UserTicket, Integer> {
}
