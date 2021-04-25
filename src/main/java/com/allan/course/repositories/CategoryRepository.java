package com.allan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allan.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
