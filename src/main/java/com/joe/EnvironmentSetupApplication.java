package com.joe;

import com.joe.Repository.EnvIdDetailsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EnvironmentSetupApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EnvironmentSetupApplication.class, args);

		// Retrieve the repository bean from the application context
		EnvIdDetailsRepository repository = context.getBean(EnvIdDetailsRepository.class);

		// Sample data
		//EnvIdDetails details1 = new EnvIdDetails("proj1", "Project A", "Group A", "groupa@example.com", "John Doe");
		//EnvIdDetails details2 = new EnvIdDetails("proj2", "Project B", "Group B", "groupb@example.com", "Jane Smith");

		// Save sample data to the database within a transaction
		//repository.save(details1);
		//repository.save(details2);

		// Print a message indicating the project has started
		System.out.println("Project Started!!");

	}

}
