package io.critical.calculator.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.BeforeClass;
import org.junit.Test;


import io.critical.start.calculator.calculateResponse;

//TimeoutTest

public class TimeoutTest {


	private static calculateResponse response;
	@BeforeClass
	public static void init() {
		
		response= new calculateResponse("13-09-2018 10:10:10", 8.0);
	}
	
	
	@Test(timeout=1000)  // milliseconds
	   public void test() throws InterruptedException {
	    	  assertThat(8.0,is(response.getResult()));
	    	  
	      }
	   }
