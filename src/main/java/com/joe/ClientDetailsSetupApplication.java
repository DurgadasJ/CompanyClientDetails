package com.joe;

import com.joe.Repository.ClientDetailsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ClientDetailsSetupApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ClientDetailsSetupApplication.class, args);

		// Retrieve the repository bean from the application context
		ClientDetailsRepository repository = context.getBean(ClientDetailsRepository.class);

		// Sample data
		//ClientDetails details1 = new ClientDetails("proj1", "Project A", "Group A", "groupa@example.com", "John Doe");
		//ClientDetails details2 = new ClientDetails("proj2", "Project B", "Group B", "groupb@example.com", "Jane Smith");

		// Save sample data to the database within a transaction
		//repository.save(details1);
		//repository.save(details2);

		// Print a message indicating the project has started
		System.out.println("Project Started!!");

	}

}
