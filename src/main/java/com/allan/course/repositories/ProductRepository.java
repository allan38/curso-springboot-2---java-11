package com.allan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allan.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
