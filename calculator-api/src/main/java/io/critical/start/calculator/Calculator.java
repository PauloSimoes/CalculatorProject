package io.critical.start.calculator;

import javax.validation.constraints.NotNull;



//Class Calculator- firstValue, secondValue, operator

public class Calculator {

	
	@NotNull(message = "First value can not be null.")
	private double firstValue;

	
	@NotNull(message = "Second value can not be null.")
	private double secondValue;

	@NotNull(message = "Operator can not be null.")
	private String operator;

	
	public Calculator() {
		
	}
	
	public Calculator(double firstValue, double secondValue, String operator) {
		super();
		
		this.firstValue = firstValue;
		this.secondValue = secondValue;
		this.operator = operator;
		
	}
	

	//Getters and Setters
	
	public double getFirstValue() {
		return firstValue;
	}
	public void setFirstValue(double firstValue) {
		this.firstValue = firstValue;
	}
	public double getSecondValue() {
		return secondValue;
	}
	public void setSecondValue(double secondValue) {
		this.secondValue = secondValue;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	
	


}