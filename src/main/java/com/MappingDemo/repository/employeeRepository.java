package com.MappingDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MappingDemo.model.Employee;

@Repository
public interface employeeRepository extends JpaRepository<Employee, Integer>{

	//@Query("select e from Employee e")
//	List<Employee>getAllEmployee();
	
//	@Modifying
//	@Query(value = "insert into employee(e.city,e.name) values (:city,:name)", nativeQuery = true)
//	void addEmployee(@RequestParam("city")String city,@RequestParam("name")String name);
	
}
