package com.onlinebook.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.onlinebook.store.entity.Authors;

@Repository
public interface AuthorRepository extends JpaRepository<Authors, Long> {

}
