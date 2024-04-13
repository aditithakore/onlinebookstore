package com.onlinebook.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinebook.store.entity.Authors;
import com.onlinebook.store.repository.AuthorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Authors> getAllAuthors() {
        return authorRepository.findAll();
    }
    public Optional<Authors> getAuthors(Long id) {
    	return authorRepository.findById(id);
    }
}
