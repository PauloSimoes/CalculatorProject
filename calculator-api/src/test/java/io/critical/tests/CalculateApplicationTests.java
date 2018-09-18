package io.critical.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.critical.calculator.tests.CalculateJsonMod;
import io.critical.start.calculator.Calculator;
import io.critical.start.calculator.CalculatorService;
import io.critical.start.calculator.calculateResponse;



@RunWith(SpringRunner.class)
public class CalculateApplicationTests {

	@Test
	public void Runtests() {
	}
	
	//Cria o objetc Mapper, reconstroi o Json e converte-o na nossa classe (Calculator)
	@Test
	public void deserialize() throws Exception {
	    ObjectMapper objectMapper = new ObjectMapper();
	    objectMapper.registerModule(new CalculateJsonMod());
	    Calculator values = new Calculator();
	    objectMapper.readValue(
			      "{\"firstValue\": 3.0,"
			      + " \"secondValue\": 5.0,"
			      + " \"operator\": \"+\" }",
			      Calculator.class);
	    
	    assertEquals(3.0, values.getFirstValue(),3);
	    assertEquals(5.0, values.getSecondValue(),5);
	    assertEquals("+", values.getOperator(), null);
	  }
	
	//Cria o objetc Mapper, reconstroi o objeto e escreve-o como json
	@Test
	 public void serialize() throws Exception{
		 ObjectMapper objectMapper = new ObjectMapper();
		 objectMapper.registerModule(new CalculateJsonMod());
		 Calculator values = new Calculator();
		 values.setFirstValue(3.0);
		 values.setSecondValue(5.0);
		 values.setOperator("+");
		 String json = objectMapper.writeValueAsString(values);
		 assertEquals("{\"firstValue\":3.0,\"secondValue\":5.0,\"operator\":\"+\"}",json);
		 
		
	 }
	
	
	
// Soma- PASS
	@Test
	public void sumPass() throws InterruptedException {
//Defino o objeto		
		Calculator values = new Calculator(3.0,5.0,"+");
 //Crio o serviço e realizo as operações		
		CalculatorService newService = new CalculatorService();
		calculateResponse response = newService.calculateOperation(values);
 //Verifico o resultado		
		assertEquals("error in sum()", 8.0, response.getResult(), 0);
		      
	}
// Soma- FAIL
	@Test
	public void sumFail() throws InterruptedException {
		Calculator values = new Calculator(3.0,5.0,"+");
		CalculatorService newService = new CalculatorService();
		calculateResponse response = newService.calculateOperation(values);
		assertNotEquals("error in sum()", 0.0, response.getResult(), 0);
	}
// Subtração- PASS
		@Test
		public void subPass() throws InterruptedException {
			Calculator values = new Calculator(5.0,3.0,"-");
			CalculatorService newService = new CalculatorService();
			calculateResponse response = newService.calculateOperation(values);
			assertEquals("error in sub()", 2.0, response.getResult(), 0);	      
		}
//Substração-FAIL		
		@Test
		public void subFail() throws InterruptedException {
			Calculator values = new Calculator(5.0,3.0,"-");
			CalculatorService newService = new CalculatorService();
			calculateResponse response = newService.calculateOperation(values);
			assertNotEquals("error in sub()", 0.0, response.getResult(), 0);
		}
//Média-PASS	
	//avg
	@Test
	public void avgPass() {
		Calculator values = new Calculator(5.0,3.0,"avg");
		CalculatorService newService = new CalculatorService();
		calculateResponse response = newService.calculateOperation(values);	      
	}
//Média-FAIL	
	@Test
	public void avgFail() throws InterruptedException {
		Calculator values = new Calculator(5.0,3.0,"avg");
		CalculatorService newService = new CalculatorService();
		calculateResponse response = newService.calculateOperation(values);
		assertNotEquals("error in avg()", 0.0, response.getResult(), 0);
	}
	
//Divisao-PASS
	@Test
	public void divPass() throws InterruptedException {
		Calculator values = new Calculator(2.0,2.0,"/");
		CalculatorService newService = new CalculatorService();
		calculateResponse response = newService.calculateOperation(values);
		assertEquals("error in div()", 1.0, response.getResult(), 0);	      
	}
//Divisao-FAIL	
	@Test
	public void divFail() throws InterruptedException {
		Calculator values = new Calculator(2.0,2.0,"/");
		CalculatorService newService = new CalculatorService();
		calculateResponse response = newService.calculateOperation(values);
		assertNotEquals("error in div()", 2.0, response.getResult(), 0);
	}
	
//Multiplicacao-PASS
	@Test
	public void multPass() {
		Calculator values = new Calculator(1.0,1.0,"*");
		CalculatorService newService = new CalculatorService();
		calculateResponse response = newService.calculateOperation(values);      
	}
	
//Multiplicacao-FAIL	
	@Test
	public void multFail() throws InterruptedException {
		Calculator values = new Calculator(2.0,2.0,"*");
		CalculatorService newService = new CalculatorService();
		calculateResponse response = newService.calculateOperation(values);
		assertNotEquals("error in mult()", 2.0, response.getResult(), 0);
	}
	
	


	
	
}
