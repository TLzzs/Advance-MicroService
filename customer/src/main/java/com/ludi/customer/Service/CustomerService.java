package com.ludi.customer.Service;

import com.ludi.customer.Dto.CustomerRegistrationRequest;
import com.ludi.customer.Model.Customer;
import com.ludi.customer.Repository.CustomerRepository;
import org.springframework.stereotype.Service;


@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        customerRepository.save(customer);


    }
}
