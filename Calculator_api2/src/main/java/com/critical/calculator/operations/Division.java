package com.critical.calculator.operations;

/**
 *  @author Paulo Simões
 *  @created 19 Set 2018
 */

public class Division extends Calculator {
	
		private double firstValue;
		private double secondValue;
		private String operation;
		
		public Division(double firstValue, double secondValue, String operation) {
		
			this.firstValue=firstValue;
			this.secondValue=secondValue;
			this.operation=operation;
		}
			
		 
		 @Override
		    public double getResult() {
		        result = firstValue / secondValue;
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
		
		@Override
		public String getEvaluate() {
			result= firstValue / secondValue;
		}
		

}