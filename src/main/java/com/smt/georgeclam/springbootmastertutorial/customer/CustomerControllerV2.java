package com.smt.georgeclam.springbootmastertutorial.customer;

import com.smt.georgeclam.springbootmastertutorial.exception.ApiRequestException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping(path = "/api/v2/customers")
@RestController
public class CustomerControllerV2 {

    private final CustomerService customerService;

    @Autowired
    public CustomerControllerV2(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/")
    List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping(path = "{customerId}")
    Customer getCustomer(@PathVariable("customerId") Long id) {
        return customerService.getCustomer(id);
    }

    @GetMapping(path = "{customerId}/exception")
    Customer getCustomerException(@PathVariable("customerId") Long id) {
        throw new ApiRequestException("APIRequestException for Customer " + id);
    }

    @PostMapping("/create")
    void createNewCustomer(@Valid @RequestBody Customer customer) {
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
