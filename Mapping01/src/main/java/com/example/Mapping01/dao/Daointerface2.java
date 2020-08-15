package com.example.Mapping01.dao;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Mapping01.model.Mappingmodel;

public interface Daointerface2 {

	void create(@RequestBody Mappingmodel mappingmodelref);

	void update(Mappingmodel mappingmodelref);

	void delete( int id);

	 List<Mappingmodel> getmappinginfo(int id);
	 List<String> criteriamethod(); 

}
