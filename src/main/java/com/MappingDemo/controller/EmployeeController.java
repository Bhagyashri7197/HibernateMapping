package com.MappingDemo.controller;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MappingDemo.editor.CustomDepartmentEditor;
import com.MappingDemo.model.Department;
import com.MappingDemo.model.Employee;
import com.MappingDemo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired 
	EmployeeService empserv;
	
	@InitBinder
	public void initBinder(WebDataBinder wdb)
	{
		wdb.registerCustomEditor(Department.class, new CustomDepartmentEditor());
	}
	
	@GetMapping("/empl")
	public List<Employee>getAllEmployee()
	{
		return empserv.findAll();
	}
	
	@Transactional
	@PostMapping("/empl/add")
	void addEmployee(@RequestBody Employee employee)
	{
		empserv.addEmployee(employee);
	}
	
}
