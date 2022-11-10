package br.com.api.jrd.service.exceptions;


@SuppressWarnings("serial")
public class ObjectNotFoundException extends RuntimeException {
   public ObjectNotFoundException(String message) {
	   super(message);
   }
}
