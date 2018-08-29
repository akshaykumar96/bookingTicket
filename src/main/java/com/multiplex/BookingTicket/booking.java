package com.multiplex.BookingTicket;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="booking")
public class booking {
	private String cast;
	private String details;
	@Id
	int id;
	private String movieFirstName;
	private String movieSecondName;
	private String ratings;
	private String showTimings;
	private String type;
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
	public String getCast() {
		return cast;
	}
	public String getDetails() {
		return details;
	}
	public int getId() {
		return id;
	}
	public String getMovieFirstName() {
		return movieFirstName;
	}
	public String getMovieSecondName() {
		return movieSecondName;
	}
	public String getRatings() {
		return ratings;
	}
	public String getShowTimings() {
		return showTimings;
	}
	public String getType() {
		return type;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setMovieFirstName(String movieFirstName) {
		this.movieFirstName = movieFirstName;
	}
	public void setMovieSecondName(String movieSecondName) {
		this.movieSecondName = movieSecondName;
	}
	public void setRatings(String ratings) {
		this.ratings = ratings;
	}
	public void setShowTimings(String showTimings) {
		this.showTimings = showTimings;
	}
	public void setType(String type) {
		this.type = type;
	} 



}
