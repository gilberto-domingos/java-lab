package br.com.jrd.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Greeting {
  private final long id;
  private final String content;

public Greeting(long id, String content) {
	this.id = id;
	this.content = content;
}


public long getId() {
	return id;
}

public String getContent() {
	return content;
}
  
  

  
  
}
