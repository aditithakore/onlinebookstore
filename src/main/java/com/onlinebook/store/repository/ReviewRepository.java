package com.onlinebook.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinebook.store.entity.Reviews;

@Repository
public interface ReviewRepository extends JpaRepository<Reviews, Long> {
}
