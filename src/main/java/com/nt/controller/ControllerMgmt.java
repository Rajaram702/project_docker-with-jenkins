package com.nt.controller;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/welcome")
public class ControllerMgmt {
	@GetMapping("/data")
     public ResponseEntity<String> getMessage(){
    	 LocalDate now = LocalDate.now();
    	 return new ResponseEntity<String>("Hii razat welcome to next project, todays date is "+now,HttpStatus.OK);
     }
}
