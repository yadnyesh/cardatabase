package io.yadnyesh.cardatabase;

import io.yadnyesh.cardatabase.model.Car;
import io.yadnyesh.cardatabase.repository.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CardatabaseApplication {

	@Autowired
	CarRepository carRepository;

	private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
		logger.info("Hello to Spring Boot");
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			carRepository.save(new Car("Ford", "Mustang", "Red", "ADF-1211", 2017, 29000));
			carRepository.save(new Car("Nissan", "Leaf", "White", "SSJ-3001", 2014, 59000));
			carRepository.save(new Car("Toyota", "Prius", "Silver", "TOT-2002", 2018, 19000));
			carRepository.save(new Car("Maruti", "Dzire", "Blue", "GA0-8936", 2010, 49000));
		};
	}
}
