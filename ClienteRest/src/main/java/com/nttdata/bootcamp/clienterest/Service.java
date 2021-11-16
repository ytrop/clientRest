package com.nttdata.bootcamp.clienterest;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;





public class Service {

	private final static Logger logger = LoggerFactory.getLogger(Service.class);
	
	RestTemplate restTemplate = new RestTemplate();
	String url = "http://localhost:8080/" ;
	String open = "open";
	String close="close";
	String halFopen = "half-open";
	
	public String setToOpen() {
		String fooResourceUrl = url+open;
		ResponseEntity<String> response = restTemplate.getForEntity(URI.create(fooResourceUrl),String.class);
		logger.info("State: +open");
		return response.getBody();
	}
	
	public String setToClose() {
		String fooResourceUrl = url+close;
		ResponseEntity<String> response = restTemplate.getForEntity(URI.create(fooResourceUrl),String.class);
		logger.info("State: +close");
		return response.getBody();
	}
	
	public String setTohalFopen() {
		String fooResourceUrl = url+halFopen;
		ResponseEntity<String> response = restTemplate.getForEntity(URI.create(fooResourceUrl),String.class);
		logger.info("State: +halFopen");
		return response.getBody();
	}
}
