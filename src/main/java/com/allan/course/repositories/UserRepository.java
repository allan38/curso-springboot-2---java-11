package com.allan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allan.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
