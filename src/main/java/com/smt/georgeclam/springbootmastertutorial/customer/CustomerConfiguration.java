package com.smt.georgeclam.springbootmastertutorial.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {

    @Value("${app.useFakeCustomerRepo:false}") // Revisit this param
    private Boolean useFakeCustomerRepo;

    @Bean  // If you remove this annotation, the printed line will not appear in the console
    CommandLineRunner commandLineRunner () {
        return args -> {
            System.out.println("Command line runner!");  // What do we use a command line runner for?
        };
    }

    @Bean
    CustomerRepo customerRepo() {
        System.out.println("useFakeCustomerRepo = " + useFakeCustomerRepo);  // Callback to the configuration
        return new CustomerFakeRepository();
    }
}
