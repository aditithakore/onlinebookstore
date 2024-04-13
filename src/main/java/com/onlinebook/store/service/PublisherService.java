package com.onlinebook.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinebook.store.entity.Publishers;
import com.onlinebook.store.repository.PublisherRepository;

import java.util.List;

@Service
public class PublisherService {

    @Autowired
    private PublisherRepository publisherService;

    public List<Publishers> getAllPayments() {
        return publisherService.findAll();
    }
}
