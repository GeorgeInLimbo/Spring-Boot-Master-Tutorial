package com.smt.georgeclam.springbootmastertutorial.customer;

import com.smt.georgeclam.springbootmastertutorial.appinfo.AppInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class CustomerConfiguration {

    @Value("${app.useFakeCustomerRepo:false}") // Revisit this param
    private Boolean useFakeCustomerRepo;

    @Value("${spring.datasource.username}")
    private String participantName;

    @Autowired
    private Environment environment;

    @Bean  // If you remove this annotation, the printed line will not appear in the console
    CommandLineRunner commandLineRunner (AppInfo infoApp) {
        return args -> {
            System.out.println("Command line runner!");  // What do we use a command line runner for?
            System.out.println(participantName);
            System.out.println(environment.getProperty("spring.datasource.url"));
            System.out.println(infoApp);
        };
    }

    @Bean
    CustomerRepo customerRepo() {
        System.out.println("useFakeCustomerRepo = " + useFakeCustomerRepo);  // Callback to the configuration
        return new CustomerFakeRepository();
    }
}
