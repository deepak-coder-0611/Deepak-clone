package com.example.Mapping01.model;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@NamedQuery(name = "getmappinginfo", query = "select m from Mappingmodel m where m.id=:id")



@Entity
@Table(name = "mappingmodel")
public class Mappingmodel {

	@Id
	@GeneratedValue
	@Column(name = "Id")
	private int id;

	@Basic
	@Column(name = "name")
	private String name;
	@Basic
	@Column(name = "city")
	private String city;

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
