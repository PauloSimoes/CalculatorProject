package io.critical.start.calculator.tests;
import static org.junit.Assert.*;
import org.junit.Test;

import io.critical.start.calculator.Calculator;
import io.critical.start.calculator.CalculatorService;
import io.critical.start.calculator.calculateResponse;

/*public class TimeoutTest {
	   @Test(timeout=1000)  // milliseconds
	   public void test() {
	      while (true) {}
	   }
	}*/

public class AddSubTests {
	   @Test
	   public void testAddPass() {
		  Calculator values = new Calculator(3.0,5.0,"+");
		  CalculatorService newService = new CalculatorService();
		  calculateResponse response = newService.calculateOperation(values);
		   
	      // assertEquals(String message, long expected, long actual)
	      assertEquals("error in add()", 8.0, response.getResult(), 0);	      
	   }
	 
	   @Test
	   public void testAddFail() {
		   Calculator values = new Calculator(3.0,5.0,"+");
		   CalculatorService newService = new CalculatorService();
		   calculateResponse response = newService.calculateOperation(values);
	      // assertNotEquals(String message, long expected, long actual)
	      assertNotEquals("error in add()", 0.0, response.getResult(), 8);
	   }
	 
	   @Test(expected = IllegalArgumentException.class)
	   public void testSubPass() {
		   Calculator values = new Calculator(3.0,5.0,"-");
		   CalculatorService newService = new CalculatorService();
		   calculateResponse response = newService.calculateOperation(values);
	       assertEquals("error in sub()",  -2.0, response.getResult(), 4);
	   }
	 
	   @Test(expected = IllegalArgumentException.class)
	   public void testSubFail() {
		   
		   Calculator values = new Calculator(3.0,5.0,"-");
		   CalculatorService newService = new CalculatorService();
		   calculateResponse response = newService.calculateOperation(values);
	       assertNotEquals("error in sub()", 2.0, response.getResult(), 4);
	   
	   			}
}
