package com.critical.calculator.operations;

public class CalculatorFactory {
	
	public static Calculator getCalculator(String type, double firstValue, double secondValue, String operation, double result){
		if("Addition".equalsIgnoreCase(type)) return new Addition(firstValue, secondValue, operation,result);
		else if("Multiplication".equalsIgnoreCase(type)) return new Multiplication (firstValue, firstValue, operation,result);
		else if ("Division".equalsIgnoreCase(type)) return new Division (firstValue, firstValue, operation,result);
		else if ("Subtraction".equalsIgnoreCase(type)) return new Subtraction (firstValue, firstValue, operation,result);
		else if ("Average".equalsIgnoreCase(type)) return new Average (firstValue, firstValue, operation,result);
		
		return null;
	}


}
