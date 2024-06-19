package com.registration.loginregistrator.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.registration.loginregistrator.DTO.Datatransfer;
import com.registration.loginregistrator.DTO.JSONResponse;
import com.registration.loginregistrator.Entitylayer.Register;
import com.registration.loginregistrator.Exception.ResourceNotFoundException;
import com.registration.loginregistrator.repositery.Repositerylayer;
import com.registration.loginregistrator.serviceimp.servicelayerimplimentation;
@Service
public class Servicelayer implements servicelayerimplimentation{
	@Autowired
	private   Repositerylayer repositerylayer ;
	
	
	public ResponseEntity<JSONResponse> saveMethod( Register register) { 

		 try {
			Register ss= repositerylayer.save(register);
			 if (ss != null) {
	                String successMessage = "Registered successfully for username: " + register.getUsername();
	                JSONResponse message = new JSONResponse(successMessage);
	                return ResponseEntity.ok(message);
	            } else {
	                String failureMessage = "Registration failed";
	                JSONResponse message = new JSONResponse(failureMessage);
	                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(message);
	            }
	        } catch (DataIntegrityViolationException e) {
	            
	            String errorMessage = "The given credentials already exist in the database. Try using different credentials.";
	            JSONResponse message = new JSONResponse(errorMessage);
	            return ResponseEntity.status(HttpStatus.CONFLICT).body(message);
	        } catch (Exception e) {
	            String errorMessage = "Registration failed due to an internal server error.";
	            JSONResponse message = new JSONResponse(errorMessage);
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(message);
	        }

	        }
	    
	
	
	public Datatransfer  fetchDetails(String username, String password) throws ResourceNotFoundException {
		
		Register aa=repositerylayer.getbyusernameandpassword(username,password);
		  
        if (aa == null) {
            throw new ResourceNotFoundException("the given USERNAME: " + username +" and PASSWORD :"+password+ "   are bad credentials");
   }
	Datatransfer dt=RegisterToDatatransfer(aa);
	return dt;
	}

	
	public Datatransfer RegisterToDatatransfer(Register rrr) {
		Datatransfer dt =new Datatransfer();
		dt.setUsername(rrr.getUsername());
		dt.setPassword(rrr.getPassword());
		dt.setEmail(rrr.getEmail());
         dt.setGender(rrr.getGender());
         dt.setPhonenumber(rrr.getPhonenumber());
		return dt;
	}
}
