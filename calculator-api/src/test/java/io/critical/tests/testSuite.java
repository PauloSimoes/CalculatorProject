package io.critical.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import io.critical.calculator.tests.TimeoutTest;
import io.critical.calculator.tests.httpRequesTest;



@RunWith(Suite.class)
@SuiteClasses({CalculateApplicationTests.class , httpRequesTest.class, TimeoutTest.class})
public class testSuite {
	
}
