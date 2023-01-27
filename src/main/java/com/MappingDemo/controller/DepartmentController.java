package com.MappingDemo.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MappingDemo.model.Department;
import com.MappingDemo.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentService deptserv;
	
	@GetMapping("/dept")
	List<Department>getAllDepartment()
	{
		return deptserv.findAll();
	}
	
	@Transactional
	@PostMapping("/dept/add")
	public void addDepartment(@RequestBody Department d)
	{
		deptserv.addDepartment(d);
	}
}
