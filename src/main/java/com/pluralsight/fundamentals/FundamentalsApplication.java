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
			appRepository.save(new Application("Expenses", "An application to submit expenses", "Jane Doe"));
			appRepository.save(new Application("Bookings", "An application used to book tickets", "JMary Richards"));

			Release release = new Release("2020-09-12", "desc1");
			releaseRepository.save(release);

			ticketRepository.save(new Ticket("test1", "desc1", "status1",application, release ));

		};
	}



}
