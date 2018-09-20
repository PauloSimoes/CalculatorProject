package com.critical.calculator.operations;

public class CalculatorFactory {
	
	public static Calculator getCalculator(String type, double firstValue, double secondValue, String operation){
		if("Addition".equalsIgnoreCase(type)) return new Addition(firstValue, secondValue, operation);
		else if("Multiplication".equalsIgnoreCase(type)) return new Multiplication (firstValue, firstValue, operation);
		else if ("Division".equalsIgnoreCase(type)) return new Division (firstValue, firstValue, operation);
		else if ("Subtraction".equalsIgnoreCase(type)) return new Subtraction (firstValue, firstValue, operation);
		else if ("Average".equalsIgnoreCase(type)) return new Average (firstValue, firstValue, operation);
		
		return null;
	}


}
