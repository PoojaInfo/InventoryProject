package com.cjc.main.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.ServiesI.UserServiesI;
import com.cjc.main.model.Student;

@RestController
public class StudentController
{
	@Autowired  UserServiesI userviesi;
	
	@PostMapping("/PostAllData")
	public ResponseEntity<Student> GETallData(@RequestBody Student s)
	{
				Student use = userviesi.getAllData(s);
		return new ResponseEntity<Student>(use,HttpStatus.Created);
	}

	@getmapping("/get")
	public ResponseEntity<Student> GETallData(@RequestBody Student s)
	{
				Student use = userviesi.getAllData(s);
		return new ResponseEntity<Student>(use,HttpStatus.OK);
	}



	
	
}
