package com.example.demo;

import com.example.demo.domain.Subscriber;
import com.example.demo.domain.SubscriberRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(SubscriberRepository repository){
		return args -> {
			repository.save( new Subscriber("Michael", "Yaroshevsky", "mi@goo.com"));
		};
	}
}
