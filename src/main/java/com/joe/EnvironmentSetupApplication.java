package com.joe;

import com.joe.Entity.EnvIdDetails;
import com.joe.Repository.EnvIdDetailsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
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
/*
Heap dump has been created at C:\Users\Swapnali joshi\AppData\Local\JetBrains\IdeaIC2023.1\tmp\hprof-temp\heapDump-idea-1720542914185.hprof. It will be analyzed next time you start IntelliJ IDEA.Heap dump has been created at C:\Users\Swapnali joshi\AppData\Local\JetBrains\IdeaIC2023.1\tmp\hprof-temp\heapDump-idea-1720542914185.hprof. It will be analyzed next time you start IntelliJ IDEA.
 must be manually assigned before calling 'persist()'
	at org.hibernate.event.internal.AbstractSaveEventListener.performSave(AbstractSaveEventListener.java:209) ~[hibernate-core-6.5.2.Final.jar:6.5.2.Final]

 */