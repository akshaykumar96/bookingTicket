package com.multiplex.BookingTicket;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookingService {
	@Autowired
	private BookingRepo repo;
	@Autowired
	private ShortBookingRepo repo1;
	
	public booking findById(int id)
	{
		return(repo.findById(id));
		
		
	}
	public List<ShortBooking>findByShort(String fnam)
	{
		return(repo1.findBymovieFirstName(fnam));
	}

}
