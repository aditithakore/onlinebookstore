package com.onlinebook.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinebook.store.entity.Books;
import com.onlinebook.store.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public List<Books> getAllBooks() {
		return bookRepository.findAll();
	}
	public List<Books> getAllByCategory(Long id){
		return bookRepository.findByCategoryId(id);
	}
	public List<Books> getAllByTrending(){
		return bookRepository.findByIsTrending(true);
	}
	public List<Books> getAllByHero(){
		return bookRepository.findByOnHero(true);
	}
	public List<Books> getAllByDealOfTheDay(){
		return bookRepository.findByIsDealOfTheDay(true);
	}
	public Optional<Books> getBookDetails(Long id) {
		return bookRepository.findById(id);
	}
	public List<Books> getByName(String title){
		return bookRepository.findByTitle(title);
	}
}
