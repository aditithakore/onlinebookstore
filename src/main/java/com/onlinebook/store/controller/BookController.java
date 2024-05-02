package com.onlinebook.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.onlinebook.store.entity.Books;
import com.onlinebook.store.service.BookService;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Books> getAllBooks() {
        return bookService.getAllBooks();
    }
    
    @GetMapping("/category")
    public List<Books> getAllByCategory(@RequestParam Long id) {
        return bookService.getAllByCategory(id);
    }
    
    @GetMapping("/isTrending")
    public List<Books> getIsTrending() {
        return bookService.getAllByTrending();
    }
    
    @GetMapping("/onHero")
    public List<Books> getOnHero() {
        return bookService.getAllByHero();
    }
    
    @GetMapping("/dealOfTheDay")
    public List<Books> getDealOfTheDay() {
        return bookService.getAllByDealOfTheDay();
    }
    @GetMapping("/details")
    public Optional<Books> getBookDetails(@RequestParam Long id) {
        return bookService.getBookDetails(id);
    }
    @GetMapping("/search")
    public List<Books> getByTitle(@RequestParam String by){
    	return bookService.getByName(by);
    }	
    
    // Add other REST endpoints as needed

}
