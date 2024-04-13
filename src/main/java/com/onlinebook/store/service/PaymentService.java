package com.onlinebook.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinebook.store.entity.Payments;
import com.onlinebook.store.repository.PaymentRepository;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public List<Payments> getAllPayments() {
        return paymentRepository.findAll();
    }
}
