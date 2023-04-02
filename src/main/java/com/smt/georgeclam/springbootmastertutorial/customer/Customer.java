package com.smt.georgeclam.springbootmastertutorial.customer;

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

    public Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{"
                + "id="
                + getId()
                + ", name='"
                + name
                + "'"
                + '}';
    }
}
