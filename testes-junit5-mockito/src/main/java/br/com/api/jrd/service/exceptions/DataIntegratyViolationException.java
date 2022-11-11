package br.com.api.jrd.service.exceptions;

public class DataIntegratyViolationException extends RuntimeException{
	public DataIntegratyViolationException(String message) {
		super(message);
	}

}
