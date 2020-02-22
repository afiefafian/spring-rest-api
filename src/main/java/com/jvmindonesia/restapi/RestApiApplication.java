package com.jvmindonesia.restapi;

import com.jvmindonesia.restapi.domain.Car;
import com.jvmindonesia.restapi.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CarRepository repository) {
		return (args) -> {
			repository.save(new Car("Ford", "Ford", "Red", "Diesel", 2013));
			repository.save(new Car("Toyota", "Tayo", "Blue", "Gasoline", 2014));
			repository.save(new Car("Honda", "Civic", "Black", "Gasoline", 2010));
			repository.save(new Car("Honda", "Brio", "Black", "Gasoline", 2011));
			repository.save(new Car("Toyota", "Corolla", "Black", "Gasoline", 2001));
		};
	}
}
