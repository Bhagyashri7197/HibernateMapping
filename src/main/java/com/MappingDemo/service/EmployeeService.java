package com.MappingDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MappingDemo.model.Employee;
import com.MappingDemo.repository.employeeRepository;

@Service
public class EmployeeService {
	@Autowired
	employeeRepository emprepo;
	
	public List<Employee>findAll()
	{
		return emprepo.findAll();
	}
	
	public void addEmployee(Employee employee)
	{
		emprepo.save(employee);
	
	}

}
