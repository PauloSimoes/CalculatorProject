package com.critical.calculator.operations;

import java.util.Date;

/** @Author : Paulo Simões
 *  @CalculateResponse - gets and sets
 *  @params - result, time
 */


public class CalculatorResponse {
	private double result;
	private Date time;

	
	public CalculatorResponse() {

		super();

	}
	

	public CalculatorResponse(double result, Date time) {

		super();

		this.result = result;

		this.time = time;

	}


	public double getResult() {

		return result;

	}

	public void setResult(double result) {

		this.result = result;

	}

	public Date getTime() {

		return time;

	}

	public void setTime(Date time) {

		this.time = time;

	}


}