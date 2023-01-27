package com.MappingDemo.model;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Department")
@Data
@NoArgsConstructor

public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int deptid;
	
	@Column
	private String name;
	
	@OneToMany(mappedBy = "dept", fetch = FetchType.EAGER)
	@JsonIgnore
	private List<Employee>employee;

	public Department(int deptid) {
		super();
		this.deptid = deptid;
	}
}
