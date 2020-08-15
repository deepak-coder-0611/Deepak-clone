package com.example.Mapping01.rest;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Mapping01.model.Mappingmodel;



public interface mappingrest {
	


@PostMapping("/post")
@ResponseBody
public void create(@RequestBody Mappingmodel mappingmodelref);



@PutMapping("/put")
@ResponseBody
public void update(@RequestBody Mappingmodel mappingmodelref);


@DeleteMapping ("/delete/{id}")
@ResponseBody
public void delete( @PathVariable int id);


@GetMapping(path = "/getbyid")
@ResponseBody
List<Mappingmodel> getmappinginfo(@RequestParam int id); 


@GetMapping( "/getcriteriaquery")
@ResponseBody
List<String> criteriamethod(); 

}
