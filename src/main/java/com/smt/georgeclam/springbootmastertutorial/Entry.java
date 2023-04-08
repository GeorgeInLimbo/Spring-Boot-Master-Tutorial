package com.smt.georgeclam.springbootmastertutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Entry {
	public static void main(String[] args) {
		SpringApplication.run(Entry.class, args);
	}
}
