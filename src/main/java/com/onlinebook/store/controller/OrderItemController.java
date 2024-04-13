package com.onlinebook.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.onlinebook.store.entity.OrderItems;
import com.onlinebook.store.service.OrderItemService;

import java.util.List;

@RestController
@RequestMapping("/orderitems")
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    @GetMapping
    public List<OrderItems> getAllOrderItems() {
        return orderItemService.getAllOrderItems();
    }

    // Add other REST endpoints as needed

}
