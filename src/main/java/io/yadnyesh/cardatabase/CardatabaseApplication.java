package io.yadnyesh.cardatabase;

import io.yadnyesh.cardatabase.model.Car;
import io.yadnyesh.cardatabase.model.Owner;
import io.yadnyesh.cardatabase.model.User;
import io.yadnyesh.cardatabase.repository.CarRepository;
import io.yadnyesh.cardatabase.repository.OwnerRepository;
import io.yadnyesh.cardatabase.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class CardatabaseApplication {

	@Autowired
	CarRepository carRepository;

	@Autowired
	OwnerRepository ownerRepository;

	@Autowired
	UserRepository userRepository;
	
	private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
		logger.info("Hello to Spring Boot");
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			Owner owner1 = new Owner("Yadnyesh", "Juvekar");
			Owner owner2 = new Owner("Bindiya", "Juvekar");
			ownerRepository.save(owner1);
			ownerRepository.save(owner2);
			Set<Owner> ownerList = new HashSet<>();
			ownerList.add(owner1);
			ownerList.add(owner2);

			carRepository.save(new Car("Ford", "Mustang", "Red", "ADF-1211", 2017, 29000, owner1));
			carRepository.save(new Car("Nissan", "Leaf", "White", "SSJ-3001", 2014, 59000, owner2));
			carRepository.save(new Car("Toyota", "Prius", "Silver", "TOT-2002", 2018, 19000, owner1));
			carRepository.save(new Car("Maruti", "Dzire", "Blue", "GA0-8936", 2010, 49000, owner2
			));

			userRepository.save( new User("user", new BCryptPasswordEncoder().encode("password"), "USER"));
		};
	}
}
