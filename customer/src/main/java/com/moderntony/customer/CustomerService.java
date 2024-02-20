package com.moderntony.customer;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    public void registerCustomer(CustomerReqistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        // todo: check if emial is valid
        // todo: check if email is already taken
        // todo: store the customer in the database
    }
}
