package com.smt.georgeclam.springbootmastertutorial.customer;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
// Give us an abstraction (JPA magic)