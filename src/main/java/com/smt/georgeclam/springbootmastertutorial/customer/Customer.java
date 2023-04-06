package com.smt.georgeclam.springbootmastertutorial.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

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

    @NotBlank(message = "Name must be provided.")
    private final String name;

    @NotBlank(message = "Password must be provided.")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private final String password;

    @NotBlank(message = "Email must be complete and valid.")
    @Email // You can include a regex parameter to customize your validation
    private final String email;

    public Customer(Long id,
                    String name,
                    String password,
                    String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
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

    public String getEmail() {
        return email;
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
                + ", email='"
                + email
                + '\''
                + '}';
    }
}
