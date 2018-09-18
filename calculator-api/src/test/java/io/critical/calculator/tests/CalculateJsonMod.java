package io.critical.calculator.tests;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.module.SimpleModule;

import io.critical.start.calculator.Calculator;
import io.critical.calculator.tests.CalculateDeserializer;
import io.critical.calculator.tests.CalculateSerialize;

//Service that adds the Serializer and Deserializer classes
@Service
public class CalculateJsonMod extends SimpleModule {
	private static final long serialVersionUID = 1L;
	
	public CalculateJsonMod() {
		this.addDeserializer(Calculator.class, new CalculateDeserializer());
		this.addSerializer(Calculator.class, new CalculateSerialize());
	}

}