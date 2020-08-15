package com.example.Myspring.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Myspring.model.MYspringModel;

@RestController
public class MyspringRest{
 
	@Autowired
	MyspringInterfacerest myspringref;
	@PostMapping("/add")
	@ResponseBody
	public void add(@RequestBody MYspringModel mymodelref) {
		myspringref.save(mymodelref);

	}

	@GetMapping("/get{id}")
	public List<MYspringModel> get(@PathVariable int id) {

		return myspringref.findAllById(id);

	}

	@GetMapping("/req")
	public List<MYspringModel> request(@RequestParam int id) {
		return myspringref.findAllById(id);
	}

	@PutMapping("/put")
	public void put(@RequestBody MYspringModel mymodelref) {
		
		myspringref.save(mymodelref);

		
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		myspringref.deleteById(id);

	}
}
