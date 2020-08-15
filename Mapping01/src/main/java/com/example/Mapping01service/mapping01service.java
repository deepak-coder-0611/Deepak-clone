package com.example.Mapping01service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Mapping01.model.Mappingmodel;

public interface mapping01service {

	void create(@RequestBody Mappingmodel mappingmodelref);

	void update(@RequestBody Mappingmodel mappingmodelref);
	
	void delete(@PathVariable int id);
	
	List<Mappingmodel> getmappinginfo(@RequestParam int id);

	List<String> criteriamethod(); 
	
	

}
