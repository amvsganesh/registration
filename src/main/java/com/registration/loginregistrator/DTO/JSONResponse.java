package com.registration.loginregistrator.DTO;

public class JSONResponse {
private String message;

public JSONResponse() {
	super();
}

public JSONResponse(String message) {
	super();
	this.message = message;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
}
