package com.example.Relationship.Student;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	public EmployeeRepository employeeRepo;
	
	public List<Employee> getAllEmployees()
	{
		List<Employee>employees=new ArrayList<>();
		employeeRepo.findAll().forEach(employees::add);
		return employees;
	}

	public void addEmployee(Employee employee) {
		
		employeeRepo.save(employee);		
	}	

	public Employee updateEmployee(Employee employee, int id) { // Method is prototype. just for test

		Employee findemployee = employeeRepo.findById(id).orElse(null);
		findemployee.setName(employee.getName());
		findemployee.setAge(employee.getAge());
		findemployee.setSalary(employee.getSalary());
		return employeeRepo.save(findemployee);
	}

	public String deleteEmployee(int id) {
		employeeRepo.deleteById(id);
		return "Employee deleted";
	}

	
}
