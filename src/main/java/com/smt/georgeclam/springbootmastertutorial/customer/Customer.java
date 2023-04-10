package com.smt.georgeclam.springbootmastertutorial.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Customer {

    @Id
    private Long id;

    @NotBlank(message = "Name must be provided.")
    private String name;

    @NotBlank(message = "Password must be provided.")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)  // Protects passwords from exposure
    private String password;

    @NotBlank(message = "Email must be complete and valid.")
    @Email // You can include a regex parameter to customize your validation
    private String email;

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
}
