package com.critical.calculator.operations;

/** @Author : Paulo Simões
 *  @CalculateVersion2 - gets and sets
 *  @params - firstValue, secondValue, operator
 */

public abstract class Calculator {
	public abstract double getfirstValue();
	public abstract double getsecondValue();
	public abstract String getOperation();
	public abstract double getResult();
	public abstract String getEvaluate();
}