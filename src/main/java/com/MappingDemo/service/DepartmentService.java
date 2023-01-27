package com.MappingDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.MappingDemo.model.Department;
import com.MappingDemo.repository.departmentRepository;

@Service
public class DepartmentService {
	@Autowired
	departmentRepository deptrepo;
	
	@Transactional
	public List<Department>findAll()
	{
		List<Department> list =  deptrepo.findAll();
		return list;
	}
	
	public void addDepartment(Department d)
	{
		deptrepo.save(d);
//		deptrepo.addDepartment(name, emp_id);
	}
}
