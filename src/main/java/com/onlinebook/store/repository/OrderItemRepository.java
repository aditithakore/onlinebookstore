package com.onlinebook.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinebook.store.entity.OrderItems;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItems, Long> {
}
