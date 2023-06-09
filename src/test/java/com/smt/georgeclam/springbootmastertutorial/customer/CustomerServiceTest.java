package com.smt.georgeclam.springbootmastertutorial.customer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CustomerServiceTest {
    @Autowired
    private CustomerRepository customerRepository;
    private CustomerService underTest;

    @BeforeEach
    void setUp() {
        underTest = new CustomerService(customerRepository);
    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }

    @Test
    void getCustomers() {
        Customer jamila = new Customer(1L, "Jamila", "password", "jamila@gmail.com");
        Customer ali = new Customer(2L, "Ali", "passw0rd", "ali@gmail.com");

        customerRepository.saveAll(Arrays.asList(jamila, ali));

        List<Customer> customers = underTest.getCustomers();

        assertEquals(2, customers.size());
    }

    @Test
    void getCustomer() {
        // Given
        Customer jamila = new Customer(1L, "Jamila", "password", "jamila@gmail.com");

        customerRepository.save(jamila);

        //When
        Customer actual = underTest.getCustomer(1L);

        //Then
        assertEquals(1L, actual.getId());
        assertEquals("Jamila", actual.getName());
        assertEquals("password", actual.getPassword());
        assertEquals("jamila@gmail.com", actual.getEmail());
    }
}