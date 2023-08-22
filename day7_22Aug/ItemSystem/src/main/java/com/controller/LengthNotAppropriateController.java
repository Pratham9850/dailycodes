package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class LengthNotAppropriateController {

	@ExceptionHandler(LengthNotAppropriateException.class)
	public ResponseEntity<String> exception(LengthNotAppropriateException e){
		return new ResponseEntity<>("Length less than 3",HttpStatus.NOT_FOUND);
	}
}
