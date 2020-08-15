package com.example.Myspring.rest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Myspring.model.MYspringModel;

public interface MyspringInterfacerest extends JpaRepository<MYspringModel, Integer> {
	
	

	List<MYspringModel> findAllById(int id);
	
	
	
	
	

}
