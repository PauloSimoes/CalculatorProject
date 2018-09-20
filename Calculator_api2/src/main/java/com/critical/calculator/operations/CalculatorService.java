package com.critical.calculator.operations;
import org.springframework.stereotype.Service;



@Service
public class CalculatorService {

	private CalculatorBuilder service;

	

	public void setCalculatorBuilder (CalculatorBuilder calc) {

		service = calc;

	}

	

	 public Calculator getCalculator() {

	        return service.getCalculate();

	    }



	    public void constructOperations() {

	    	service.createNewCalculate();;

	    	service.Average();;

	    	service.Addition();

	    	service.Division();

	    	service.Multiplication();

	    	service.Subtraction();

	    }

	}