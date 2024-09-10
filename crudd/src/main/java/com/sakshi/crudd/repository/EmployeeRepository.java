package com.sakshi.crudd.repository;

import com.sakshi.crudd.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    // all crud database methods...
}
