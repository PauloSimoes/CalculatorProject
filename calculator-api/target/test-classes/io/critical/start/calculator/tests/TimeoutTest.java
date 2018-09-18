package io.critical.start.calculator.tests;

import org.junit.Test;

public class TimeoutTest {
	
	@Test(timeout=1000)  // milliseconds
	   public void test() {
	      while (true) {}
	   }

}
