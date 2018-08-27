package com.multiplex.BookingTicket;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="shortbooking")
public class ShortBooking {
	@Id
	int id;
	private String movieFirstName;
	private String movieSecondName;
	private String details;
	
	public int getId() {
		return id;
	}
	public ShortBooking() {}
	public ShortBooking(int id, String movieFirstName, String movieSecondName, String details, String ratings) {
		super();
		this.id = id;
		this.movieFirstName = movieFirstName;
		this.movieSecondName = movieSecondName;
		this.details = details;
		
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovieFirstName() {
		return movieFirstName;
	}
	public void setMovieFirstName(String movieFirstName) {
		this.movieFirstName = movieFirstName;
	}
	public String getMovieSecondName() {
		return movieSecondName;
	}
	public void setMovieSecondName(String movieSecondName) {
		this.movieSecondName = movieSecondName;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}


}
