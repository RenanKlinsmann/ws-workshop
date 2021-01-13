package com.renanmendonca.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renanmendonca.workshop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
