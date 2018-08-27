package com.multiplex.BookingTicket;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins="*")
@RestController
public class BookingController {
	@Autowired
	private BookingService service;
	@GetMapping("/api/booking/{id}")
	public booking getProducts(@PathVariable("id") int id) {
		return service.findById(id);
		
	}
	@GetMapping("/api/shortbooking/{fname}")
	public List<ShortBooking>getshort(@PathVariable("fname")String fname)
	{
		return service.findByShort(fname);
	
	}

}
