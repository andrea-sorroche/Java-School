package com.javaschool.railway.repository;

import com.javaschool.railway.entity.RoutePart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoutePartRepository extends JpaRepository<RoutePart, Integer> {
}
