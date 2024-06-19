package com.registration.loginregistrator.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.registration.loginregistrator.DTO.Datatransfer;
import com.registration.loginregistrator.DTO.JSONResponse;
import com.registration.loginregistrator.Entitylayer.Register;
import com.registration.loginregistrator.Exception.ResourceNotFoundException;
import com.registration.loginregistrator.service.Servicelayer;
@RestController
@RequestMapping("/api/user")
public class Contollerlayer {
	@Autowired
	private  Servicelayer servicelayer;
	
	 @GetMapping("/fetch")
	    public Datatransfer getUser(@RequestParam String username ,@RequestParam String password) throws ResourceNotFoundException {
		
		  return servicelayer.fetchDetails(username,password);
	        
	    }
 @PostMapping("/register")
 	   public ResponseEntity<JSONResponse> insert(@Valid @RequestBody Register register  ) throws ResourceNotFoundException {
	 return  servicelayer.saveMethod(register);
		  
		}
}
