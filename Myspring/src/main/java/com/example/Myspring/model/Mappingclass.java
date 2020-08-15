package com.example.Myspring.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table (name="Address")
public class Mappingclass {
     @Id 
	private int id ;
	private String dis;
	private String city;
	
	
}
