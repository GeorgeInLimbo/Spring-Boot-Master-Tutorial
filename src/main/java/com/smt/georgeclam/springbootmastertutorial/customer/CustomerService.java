package com.smt.georgeclam.springbootmastertutorial.customer;

import org.springframework.stereotype.Component;

import java.util.List;

/****
 <b>Title:</b> CustomerService<br>
 <b>Project:</b> spring-boot-master-tutorial<br>
 <b>Description:</b> <br>
 <b>Copyright:</b> Copyright (c) 2023<br>
 <b>Company:</b> Silicon Mountain Technologies<br>
 @author George Clam
 @version 1.0
 @since 4/1/23
 @updates: ****/

@Component
public class CustomerService {

    private final CustomerRepo customerRepo;


    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    List<Customer> getCustomer() {
        return customerRepo.getCustomers();
    }
}
