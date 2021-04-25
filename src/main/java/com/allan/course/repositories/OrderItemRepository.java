package com.allan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allan.course.entities.OrderItem;
import com.allan.course.entities.pk.OrderItensPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItensPK> {

}
