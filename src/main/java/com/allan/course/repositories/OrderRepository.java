package com.allan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allan.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
