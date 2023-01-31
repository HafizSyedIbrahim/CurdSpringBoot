package com.example.Relationship.Student;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.example.Relationship.Department.Department;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Employee")
public class Employee {

	@Id
	@GeneratedValue
	int id;
	String name;
	int age;
	int salary;
	String address;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fkdepartmentid")
	public Department dept;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setDepartment(Department department) {
	
			this.dept = department;
	}
	
	public Department getDepartment() {
		
		return dept;
	}
	
}
