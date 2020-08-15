package com.Mapping.MappingDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Modelemployee {
	
	@Id
    @Column 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empid;
	
	@Column
	private String empname;
	
	@Column
	private String empsurname;

	@OneToOne
	private Model model;

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpsurname() {
		return empsurname;
	}

	public void setEmpsurname(String empsurname) {
		this.empsurname = empsurname;
	}

}
