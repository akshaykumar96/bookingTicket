package com.multiplex.BookingTicket;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="booking")
public class booking {
	@Id
	int id;
	private String movieFirstName;
	private String movieSecondName;
	private String details;
	private String ratings;
	private String showTimings;
	private String type;
	private String cast;
	public int getId() {
		return id;
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
	public String getRatings() {
		return ratings;
	}
	public void setRatings(String ratings) {
		this.ratings = ratings;
	}
	public String getShowTimings() {
		return showTimings;
	}
	public void setShowTimings(String showTimings) {
		this.showTimings = showTimings;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}
	public booking() {}
	public booking(int id, String movieFirstName, String movieSecondName, String details, String ratings,
			String showTimings, String type, String cast) {
		super();
		this.id = id;
		this.movieFirstName = movieFirstName;
		this.movieSecondName = movieSecondName;
		this.details = details;
		this.ratings = ratings;
		this.showTimings = showTimings;
		this.type = type;
		this.cast = cast;
	} 
	
	

}
