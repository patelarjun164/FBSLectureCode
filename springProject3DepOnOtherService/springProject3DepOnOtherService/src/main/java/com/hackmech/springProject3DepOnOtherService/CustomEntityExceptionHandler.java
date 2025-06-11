package com.hackmech.springProject3DepOnOtherService;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomEntityExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(value= {Exception.class})
	public ResponseEntity<Object> handleError(Exception e, WebRequest req) {
		
		String responseText = "Houston!!! We have a problem";
		
		return handleExceptionInternal(e, responseText, new HttpHeaders(),HttpStatus.OK, req);
	}
}
