package com.onlinebook.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinebook.store.entity.Books;
import com.onlinebook.store.repository.BookRepository;

import java.util.List;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public List<Books> getAllBooks() {
		return bookRepository.findAll();
	}

}
