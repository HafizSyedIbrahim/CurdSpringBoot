package com.example.Relationship.Student;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/employees")
	public void addEmployee(@RequestBody Employee employee)
	{
		employeeService.addEmployee(employee);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/employees/{id}")
	public void UpdateEmployee(@PathVariable int id, @RequestBody Employee employee)
	{
		employeeService.updateEmployee(employee,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/employees/{id}")
	public String DeleteEmployee(@PathVariable int id)
	{
		return employeeService.deleteEmployee(id);
	}
}

