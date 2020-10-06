package com.pluralsight.fundamentals;

import com.pluralsight.fundamentals.entities.Application;
import com.pluralsight.fundamentals.entities.Release;
import com.pluralsight.fundamentals.entities.Ticket;
import com.pluralsight.fundamentals.repositories.ApplicationRepository;
import com.pluralsight.fundamentals.repositories.ReleaseRepository;
import com.pluralsight.fundamentals.repositories.TicketRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.beans.BeanProperty;

@SpringBootApplication
public class FundamentalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FundamentalsApplication.class, args);
		System.out.println("Hello Pluralsight");
	}

	@Bean
	public CommandLineRunner demo(ApplicationRepository appRepository,
								  TicketRepository ticketRepository,
								  ReleaseRepository releaseRepository){
		return (args) -> {
			Application application = new Application("Trackzilla", "A bug tracking application", "Kesha Williams");
			appRepository.save(application);
			Application application2 = new Application("Expenses", "An application to submit expenses", "Jane Doe");
			appRepository.save(application2);

			Application application3 = new Application("Bookings", "An application used to book tickets", "John Doe");
			appRepository.save(application3);

			Application application4 = new Application("Invoice Search", "An application used to search invoices", "Mary Richards");
			appRepository.save(application4);

			Application application5 = new Application("Audits", "An application used for auditing purposes", "Tiffany Stewart");
			appRepository.save(application5);


			Release release = new Release("2020-03-32", "Q1 Release containing high priority bugs");
			releaseRepository.save(release);
			ticketRepository.save(new Ticket("Sort Feature", "Add the ability to sort tickers by severity", "OPEN",application2, release ));

			release = new Release("2020-06-29", "Q2 Release containing high priority enhancements");
			releaseRepository.save(release);
			ticketRepository.save(new Ticket("Search Feature", "Add the ability to search by invoice date", "IN PROGRESS",application4, release ));

			release = new Release("2020-09-21", "Q3 Release containing bugs");
			releaseRepository.save(release);
			ticketRepository.save(new Ticket("Audit", "Add the ability to audit by year", "CLOSED",application5, release ));

			release = new Release("2020-12-05", "Q4 Release containing enhancements");
			releaseRepository.save(release);
			ticketRepository.save(new Ticket("Booking Feature", "Add the ability to book tickets online", "OPEN",application3, release ));



		};
	}



}
