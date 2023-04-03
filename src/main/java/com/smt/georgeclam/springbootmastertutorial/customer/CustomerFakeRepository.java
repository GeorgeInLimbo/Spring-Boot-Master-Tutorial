package com.smt.georgeclam.springbootmastertutorial.customer;

import java.util.Arrays;
import java.util.List;

/****
 <b>Title:</b> CustomerFakeRepository<br>
 <b>Project:</b> spring-boot-master-tutorial<br>
 <b>Description:</b> <br>
 <b>Copyright:</b> Copyright (c) 2023<br>
 <b>Company:</b> Silicon Mountain Technologies<br>
 @author George Clam
 @version 1.0
 @since 4/2/23
 @updates: ****/

public class CustomerFakeRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "James Bond"),
                new Customer(2L, "Jamila Ahmed")
        );
    }
}
