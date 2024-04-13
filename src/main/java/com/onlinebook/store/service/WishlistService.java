package com.onlinebook.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinebook.store.entity.Wishlists;
import com.onlinebook.store.repository.WishlistRepository;

import java.util.List;

@Service
public class WishlistService {

    @Autowired
    private WishlistRepository wishlistRepository;

    public List<Wishlists> getAllWishlists() {
        return wishlistRepository.findAll();
    }

    // Add other methods as needed

}
