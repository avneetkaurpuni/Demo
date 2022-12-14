package com.example.decptracker.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.decptracker.Entity.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
	

}
