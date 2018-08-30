package com.multiplex.BookingTicket;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@EnableMongoRepositories
@SpringBootApplication
public class BookingTicketApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingTicketApplication.class, args);
	}
}

