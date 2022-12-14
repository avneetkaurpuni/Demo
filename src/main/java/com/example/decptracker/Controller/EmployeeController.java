package com.example.decptracker.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.decptracker.Entity.Employee;
import com.example.decptracker.Repo.EmployeeRepo;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
@Autowired
EmployeeRepo employeeRepo;

@PostMapping("/add")
	public String addEmployee(@RequestBody Employee employee) {
		employeeRepo.save(employee);
		return "Employee added";

}
@GetMapping("/get")
public List<Employee> getAll(){
	return employeeRepo.findAll();
}



}
