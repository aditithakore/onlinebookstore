package com.onlinebook.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinebook.store.entity.Wishlists;

@Repository
public interface WishlistRepository extends JpaRepository<Wishlists, Long> {
}
