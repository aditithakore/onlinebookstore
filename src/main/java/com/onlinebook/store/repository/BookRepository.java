package com.onlinebook.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinebook.store.entity.Books;

@Repository
public interface BookRepository extends JpaRepository<Books, Long> {
}
