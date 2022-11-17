package br.com.api.jrd.service.exceptions;

@SuppressWarnings("serial")
public class DataIntegratyViolationException extends RuntimeException{
	public DataIntegratyViolationException(String message) {
		super(message);
	}

}
