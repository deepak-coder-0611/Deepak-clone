package com.example.Mapping01.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Mapping01.model.Mappingmodel;


@Repository
public class mappingdaompl implements Daointerface2 {

	@Autowired
	private mappingdao mappingdaoref;
   
   @PersistenceContext(name = "DEFAULT", type = PersistenceContextType.TRANSACTION)
   private EntityManager entityManager;


	@Override
	public void create(@RequestBody Mappingmodel mappingmodelref) {

		mappingdaoref.save(mappingmodelref);

	}

	@Override
	public void update(@RequestBody Mappingmodel mappingmodelref) {
	
		mappingdaoref.save(mappingmodelref);
		
	}

	@Override
	public void delete(@PathVariable int id) {
		
		mappingdaoref.deleteById(id);
	}

	@Override
	public List<Mappingmodel> getmappinginfo(@RequestParam int id) {
	
		Query query1=null;
	try {
		
		
			
			 query1 = entityManager.createNamedQuery("getmappinginfo")
					.setParameter("id", id);
		
		}
		catch (Exception e) {
			
			System.out.print(e);
		}

		return query1.getResultList();

	
	}

	@Override
	public List<String> criteriamethod() {
		 Query query1 =null;
				
	     try {
	    
	    		
	     CriteriaBuilder builder= entityManager.getCriteriaBuilder();
	     CriteriaQuery<String> query =  builder.createQuery(String.class);
	     Root<Mappingmodel> root= query.from(Mappingmodel.class);
	     query.select(root.get("name"));
	      query1 = entityManager.createQuery(query);
	     
	     }catch(Exception e) {
	    	 System.out.print(e);
	    	 
	     }
	     return query1.getResultList();
	     
		
	}



}