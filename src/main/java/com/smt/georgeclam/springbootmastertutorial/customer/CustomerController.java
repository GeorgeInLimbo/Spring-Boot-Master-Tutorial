package com.smt.georgeclam.springbootmastertutorial.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping(path = "/api/v1/customer")
@RestController
@Deprecated
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "all")
    List<Customer> getCustomer() {
        return customerService.getCustomers();
    }

    @PostMapping("/create")
    void createNewCustomer(@RequestBody Customer customer) {
        System.out.println("Post Request...");
        System.out.println(customer);
    }

    @PutMapping("update/{customerId}")
    void updateCustomer(@RequestBody Customer customer) {
        System.out.println("Update Customer");
        System.out.println(customer);
    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id) {
        System.out.println("Delete Request for Customer with ID " + id);
    }
}
