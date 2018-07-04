package com.ngd.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ngd.model.Person;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
@RestController
@RequestMapping(value = "/api/person")
public class PersonController {

	private static List<Person> personList = new ArrayList<>();
	

	@ApiModelProperty(position=1, required=true, value="1")
	@RequestMapping(method=RequestMethod.GET, value="")
	public List<Person> getAll(){
		return personList;
	}

	@ApiModelProperty(position=2, required=true, value="1")
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	public Person getById(@PathVariable("id") Integer id){
		return personList.get(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="")
	public Person putPerson(@RequestBody Person person){
		personList.add(person);
		return person;
	}

}
