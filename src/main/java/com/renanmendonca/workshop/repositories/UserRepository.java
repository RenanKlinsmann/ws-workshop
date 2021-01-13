package com.renanmendonca.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renanmendonca.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
