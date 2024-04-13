package com.onlinebook.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.onlinebook.store.entity.Wishlists;
import com.onlinebook.store.service.WishlistService;

import java.util.List;

@RestController
@RequestMapping("/wishlists")
public class WishlistController {

    @Autowired
    private WishlistService wishlistService;

    @GetMapping
    public List<Wishlists> getAllWishlists() {
        return wishlistService.getAllWishlists();
    }

    // Add other REST endpoints as needed

}
