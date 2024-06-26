package com.onlinebook.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinebook.store.entity.Payments;

@Repository
public interface PaymentRepository extends JpaRepository<Payments, Long> {
}
