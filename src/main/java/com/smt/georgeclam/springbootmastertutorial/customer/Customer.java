package com.smt.georgeclam.springbootmastertutorial.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/****
 <b>Title:</b> Customer<br>
 <b>Project:</b> spring-boot-master-tutorial<br>
 <b>Description:</b> <br>
 <b>Copyright:</b> Copyright (c) 2023<br>
 <b>Company:</b> Silicon Mountain Technologies<br>
 @author George Clam
 @version 1.0
 @since 4/1/23
 @updates: ****/

public class Customer {
    private final Long id;
    private final String name;
    private final String password;

    public Customer(Long id,
                    String name,
                    String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @JsonProperty("customerId")
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Customer{"
                + "id="
                + id
                + ", name='"
                + name
                + '\''
                + ", password='"
                + password
                + '\''
                + '}';
    }
}
