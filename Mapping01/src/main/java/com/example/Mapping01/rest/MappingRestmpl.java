package com.example.Mapping01.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mapping01.model.Mappingmodel;
import com.example.Mapping01service.mapping01service;

@RestController 
public class MappingRestmpl implements mappingrest {

	@Autowired
	private mapping01service mappingserviceref;

	@Override
	public void create(@RequestBody Mappingmodel mappingmodelref) {

		mappingserviceref.create(mappingmodelref);
	}

	@Override
	public void update(@RequestBody Mappingmodel mappingmodelref) {
		
		mappingserviceref.update(mappingmodelref);
		
	}

	@Override
	public void delete(@PathVariable int id) {
		
		mappingserviceref.delete(id);
	
		
	}

	 @Override
	public List<Mappingmodel> getmappinginfo(@RequestParam int id) {
	
		List<Mappingmodel> getmappinginfo1 = mappingserviceref.getmappinginfo(id);
		System.out.println("getmappinginfo: "+getmappinginfo1);
		return getmappinginfo1;
	}

	@Override
	public List<String> criteriamethod() {
	
		return mappingserviceref.criteriamethod();
	} 

}
