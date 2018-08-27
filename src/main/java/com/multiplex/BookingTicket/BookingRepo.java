package com.multiplex.BookingTicket;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BookingRepo extends MongoRepository<booking,Integer> {
	public booking findById(int id);

}
