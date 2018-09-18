package io.critical.start.calculator;

import java.util.concurrent.TimeUnit;

//CalculateResponse Method- Getters and Setters
//Method that returns the data and the result of the operation

/** @Author: Paulo Simões
 *  @Calcula- Cálculo dos valores
 */

public class calculateResponse {
	
	private String data;
	private double result;
	
	public calculateResponse(String data, double result) {
		super();
		this.data = data;
		this.result = result;
	}



public calculateResponse() {
	super();
	
	
}



public String getData() {
	

	
  return data;
  
    
}
	

public void setData(String data) {
	this.data = data;
	 
}


public double getResult() throws InterruptedException {
	TimeUnit.MILLISECONDS.sleep(500);
	return result;
}


public void setResult(double result) {
	this.result = result;
}





}
//}