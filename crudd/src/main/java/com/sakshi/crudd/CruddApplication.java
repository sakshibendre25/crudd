package com.sakshi.crudd;

import com.sakshi.crudd.model.Employee;
import com.sakshi.crudd.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CruddApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CruddApplication.class, args);
	}


	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Sakshi");
		employee.setLastName("Bendre");
		employee.setEmailId("bendre@gmail.com");
		employeeRepository.save(employee);


		Employee employee1 = new Employee();
		employee1.setFirstName("Rutuja");
		employee1.setLastName("Sawant");
		employee1.setEmailId("sawant@gmail.com");
		employeeRepository.save(employee);

	}
}
