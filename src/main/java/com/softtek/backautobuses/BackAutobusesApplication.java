package com.softtek.backautobuses;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackAutobusesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BackAutobusesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("\n***************************");
		System.out.println("USERS-MANAGEMENT STARTED");
		System.out.println("***************************\n");
	}
}
