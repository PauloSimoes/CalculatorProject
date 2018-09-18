package io.critical.start.calculator.tests;
import com.fasterxml.jackson.databind.module.SimpleModule;

import io.critical.start.calculator.Calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorJsonModule extends SimpleModule {
	private static final long serialVersionUID = 1L;
	
	public CalculatorJsonModule() {
		this.addDeserializer(Calculator.class, new CalculatorDeserializer());
		this.addSerializer(Calculator.class, new CalculatorSerializer());
	}

}


	
