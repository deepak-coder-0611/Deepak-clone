package com.example.Mapping01service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Mapping01.dao.Daointerface2;
import com.example.Mapping01.dao.mappingdao;
import com.example.Mapping01.model.Mappingmodel;

@Service 
public class Mapping01servicempl implements mapping01service {

	@Autowired
	private Daointerface2 daointerface2ref;

	@Override

	public void create(@RequestBody Mappingmodel mappingmodelref) {

		daointerface2ref.create(mappingmodelref);
	}

	@Override
	public void update(@RequestBody Mappingmodel mappingmodelref) {

		daointerface2ref.update(mappingmodelref);

	}

	@Override
	public void delete(@PathVariable int id) {

		daointerface2ref.delete(id);

	}

	
	  @Override
	  public List<Mappingmodel> getmappinginfo(@RequestParam int id) {
	   return daointerface2ref.getmappinginfo(id);
	  }

	@Override
	public List<String> criteriamethod() {
		// TODO Auto-generated method stub
		return daointerface2ref.criteriamethod();
	}
	 
}
