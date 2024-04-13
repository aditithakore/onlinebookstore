package com.onlinebook.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinebook.store.entity.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {
}
