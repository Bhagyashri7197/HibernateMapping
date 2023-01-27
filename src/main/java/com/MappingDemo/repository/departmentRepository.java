package com.MappingDemo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MappingDemo.model.Department;

@Repository
public interface departmentRepository extends JpaRepository<Department, Integer>{
//	@Query("select d from Department d")
//	List<Department>getAllDepartment();
//	
//	@Query(value ="insert into Department(d.deptid,d.name,d.emp_id) values (:deptid,:name,:emp_id)", nativeQuery = true)
//	void addDepartment(@RequestParam("deptid")int deptid,@RequestParam("name")String name,@RequestParam("emp_id")int emp_id);	

}
