package com.registration.loginregistrator.serviceimp;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import com.registration.loginregistrator.DTO.Datatransfer;
import com.registration.loginregistrator.DTO.JSONResponse;
import com.registration.loginregistrator.Entitylayer.Register;
import com.registration.loginregistrator.Exception.ResourceNotFoundException;

public interface servicelayerimplimentation {
	public ResponseEntity<JSONResponse> saveMethod(@Valid Register register) throws ResourceNotFoundException;
	public Datatransfer  fetchDetails(String username, String password) throws ResourceNotFoundException;
}
