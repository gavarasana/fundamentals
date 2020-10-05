package com.pluralsight.fundamentals.repositories;

import com.pluralsight.fundamentals.entities.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {
}
