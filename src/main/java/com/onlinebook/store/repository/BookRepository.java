package com.onlinebook.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinebook.store.entity.Books;
import com.onlinebook.store.entity.Categories;

import java.util.List;


@Repository
public interface BookRepository extends JpaRepository<Books, Long> {
	List<Books> findByCategoryId(Long categoryId); 
	List<Books> findByIsTrending(boolean trending);
	List<Books> findByOnHero(boolean onHero);
	List<Books> findByIsDealOfTheDay(boolean dealOfTheDay);
}
