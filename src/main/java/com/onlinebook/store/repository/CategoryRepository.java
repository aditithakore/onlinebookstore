package com.onlinebook.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinebook.store.entity.Categories;

@Repository
public interface CategoryRepository extends JpaRepository<Categories, Long> {
}
