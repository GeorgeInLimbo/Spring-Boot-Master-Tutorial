package com.smt.georgeclam.springbootmastertutorial.customer;

import java.util.Collections;
import java.util.List;

/****
 <b>Title:</b> CustomerRepository<br>
 <b>Project:</b> spring-boot-master-tutorial<br>
 <b>Description:</b> <br>
 <b>Copyright:</b> Copyright (c) 2023<br>
 <b>Company:</b> Silicon Mountain Technologies<br>
 @author George Clam
 @version 1.0
 @since 4/1/23
 @updates: ****/

public class CustomerRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        // TODO connect to a real DB
        return Collections.singletonList(
                new Customer(1L, "TODO implement real db", "todopassword", "email@gmail.com")
        );
    }
}
