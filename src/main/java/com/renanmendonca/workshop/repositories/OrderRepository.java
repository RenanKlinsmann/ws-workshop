package com.renanmendonca.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renanmendonca.workshop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
