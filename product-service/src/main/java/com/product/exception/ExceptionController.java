package com.product.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice  //global exception handling
public class ExceptionController {

	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<String> handleEmptyInput(EmptyInputException emptyInputException)
	{
		return new ResponseEntity<String> ("input field is empty,please fill it ",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<Object> exception(ProductNotFoundException exception){
        return new ResponseEntity<>("product not found", HttpStatus.NOT_FOUND);

    }
}
