package io.critical.start.calculator.tests;
import static org.junit.Assert.assertEquals;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.critical.start.calculator.Calculator;

import org.junit.Test;

public class CalculatorTest {
	
// ObjectMapper can read JSON into Java objects and write Java objects to JSON
	     @Test
		 public void deserialize() throws Exception {
			    ObjectMapper objectMapper = new ObjectMapper();
			    objectMapper.registerModule(new CalculatorJsonModule());
			     Calculator values = objectMapper.readValue(
			      "{\"firstValue\": 3.0, \"secondValue\": 5.0, \"operator\": \"+\" }",
			      Calculator.class);
			 
			    assertEquals(3.0 , values.getFirstValue(),3);
			    assertEquals(5.0, values.getSecondValue(),5);
			    assertEquals("+", values.getOperator());
			    
			  }
		 @Test
		 public void serialize() throws Exception{
			 ObjectMapper objectMapper = new ObjectMapper();
			 objectMapper.registerModule(new CalculatorJsonModule());
			 Calculator values = new Calculator();
			 values.setFirstValue(3.0);
			 values.setSecondValue(5.0);
			 values.setOperator("+");
			 String json = objectMapper.writeValueAsString(values);
			 assertEquals("{\"firstValue\":3.0,\"secondValue\":5.0,\"operator\":\"+\"}",json);
			 
			
		 }

	}


