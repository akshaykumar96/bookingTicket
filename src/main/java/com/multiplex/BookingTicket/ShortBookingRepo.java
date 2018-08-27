package com.multiplex.BookingTicket;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShortBookingRepo extends MongoRepository<ShortBooking, Integer>{
	public List<ShortBooking> findBymovieFirstName(String fname);
	

}
