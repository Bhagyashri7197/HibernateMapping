package com.MappingDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.MappingDemo.repository.departmentRepository;
import com.MappingDemo.repository.employeeRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses ={employeeRepository.class,departmentRepository.class})
public class MappingDemoApplication {
	
//	@Autowired
//	employeeRepository emprepo;
//	
//	@Autowired
//	departmentRepository deptrepo;

	public static void main(String[] args) {
		SpringApplication.run(MappingDemoApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		Employee data = new Employee(100,"xyz","Pune");
//		emprepo.save(data);
//		
//		Department d1 = new Department(001,"account",data);
//		Department d2 = new Department(002,"development",data);
//		deptrepo.save(d1);
//		deptrepo.save(d2);	
//	}
}
