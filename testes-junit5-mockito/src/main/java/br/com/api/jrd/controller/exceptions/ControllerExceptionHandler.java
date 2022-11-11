package br.com.api.jrd.controller.exceptions;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.api.jrd.service.exceptions.DataIntegratyViolationException;
import br.com.api.jrd.service.exceptions.ObjectNotFoundException;

@ControllerAdvice
public class ControllerExceptionHandler {
	
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError>objectNotFound(ObjectNotFoundException ex, HttpServletRequest request){
		
		StandardError error = new StandardError(LocalDateTime.now(),HttpStatus.NOT_FOUND.value(), ex.getMessage(),request.getRequestURI());	
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
	
	@ExceptionHandler(DataIntegratyViolationException.class)
	public ResponseEntity<StandardError>dataIntegratyViolationException(DataIntegratyViolationException ex, HttpServletRequest request){
		
		StandardError error = new StandardError(LocalDateTime.now(),HttpStatus.BAD_REQUEST.value(), ex.getMessage(),request.getRequestURI());	
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
	}

}
