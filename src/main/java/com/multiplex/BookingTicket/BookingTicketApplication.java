package com.multiplex.BookingTicket;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@DataMongoTest
@EnableMongoRepositories
@SpringBootApplication
public class BookingTicketApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingTicketApplication.class, args);
	}
}

