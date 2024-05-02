package com.onlinebook.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.onlinebook.store.entity.Authors;
import java.util.List;


@Repository
public interface AuthorRepository extends JpaRepository<Authors, Long> {
	List<Authors> findByName(String name);
	
}
