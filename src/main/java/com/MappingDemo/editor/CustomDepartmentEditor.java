package com.MappingDemo.editor;

import java.beans.PropertyEditorSupport;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.MappingDemo.model.Department;
import com.MappingDemo.repository.departmentRepository;


public class CustomDepartmentEditor extends PropertyEditorSupport{
	@Autowired
	departmentRepository deptrepo;
	
	@Override
	public String getAsText() {
		// TODO Auto-generated method stub
		 Department department = (Department) getValue();
	        return department == null ? "" : department.getName();
	}
	
	@Override
	public void setAsText(String deptId) throws IllegalArgumentException {
		Optional<Department> department = deptrepo.findById(Integer.valueOf(deptId));
		System.out.println(department.get().toString());
		setValue(department.get());
		
	}
}
