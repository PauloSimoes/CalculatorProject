package io.critical.calculator.tests;

import static org.junit.Assert.assertEquals;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import io.critical.start.CalculatorApp;
import io.critical.start.calculator.Calculator;
import io.critical.start.calculator.calculateResponse;
import io.critical.start.exceptions.ErrorDetails;



@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes={CalculatorApp.class})
public class httpRequesTest {

//Defined port=8080
    @LocalServerPort
    private int port=8080;
// String with the path for the API    
	public final String baseUrl = "http://localhost:" + port + "/calculate";
	


    @Autowired
    private TestRestTemplate restTemplate;
        
// Http post request
	 @Test
	 public void addPostRequest() {
		 String url = baseUrl;
		 
			Calculator values = new Calculator(6,3,"+");
		
// HTTP connect-POST values in specified url			
			ResponseEntity<calculateResponse> responseEntity = restTemplate.postForEntity(url , values, calculateResponse.class);
			assertEquals("Expected status", HttpStatus.OK, responseEntity.getStatusCode());

	 }
	 
	 @Test
	 public void addFailedPostRequestOperation() {
		 String url = baseUrl;
		 
			Calculator values = new Calculator(6,3,"XPTO");
		
// HTTP connect-POST values in specified url			
			ResponseEntity<ErrorDetails> responseEntity = restTemplate.postForEntity(url , values, ErrorDetails.class);
			assertEquals("Unexpected status", HttpStatus.NOT_FOUND, responseEntity.getStatusCode());

	 } 
	 
	 public void addPostNotANumber() {
		 String url = baseUrl;
		 
			Calculator values = new Calculator(0,0,"/");
		
// HTTP connect-POST values in specified url			
			ResponseEntity<ErrorDetails> responseEntity = restTemplate.postForEntity(url , values, ErrorDetails.class);
			assertEquals("Unexpected status", HttpStatus.ACCEPTED, responseEntity.getStatusCode());

	 } 
	 

	 
}
