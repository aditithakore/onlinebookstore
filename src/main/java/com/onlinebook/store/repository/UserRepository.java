package com.onlinebook.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinebook.store.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
}
