package com.critical.calculator.operations;

/**
 *  @author Paulo Simões
 *  @created 19 Set 2018
 */

public class Subtraction extends Calculator {
	
	private double firstValue;
	private double secondValue;
	private String operation;
	private double result;
	
	
	public Subtraction(double firstValue, double secondValue, String operation, double result) {
	
		this.firstValue=firstValue;
		this.secondValue=secondValue;
		this.operation=operation;
		this.result=result;
		
	}
		
	 
		@Override
	    public double getResult() {
	       return result = firstValue - secondValue;
	    }
		
		@Override
		public double getfirstValue() {
			return this.firstValue;
		}
		
		@Override
		public double getsecondValue() {
			return this.secondValue;
		}
		
		@Override
		public String getOperation() {
			return this.operation;
		}
		

}