package com.onlinebook.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinebook.store.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
	List<Users> findByUsername(String username);
}
