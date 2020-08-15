package com.Mapping.MappingDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Model {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
    @Column
	private String name;
	
    @Column
	private String Surname;
    
    @OneToOne
    private Modelemployee Modelemployee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public Modelemployee getModelemployee() {
		return Modelemployee;
	}

	public void setModelemployee(Modelemployee modelemployee) {
		Modelemployee = modelemployee;
	}

}
