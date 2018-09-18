package io.critical.calculator.tests;

import java.io.IOException;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import io.critical.start.calculator.Calculator;


//Method that arrange the Java object into JSON)
public class CalculateSerialize extends JsonSerializer<Calculator> {

	@Override
	public void serialize(
			Calculator values, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
			throws IOException, JsonProcessingException {
			jsonGenerator.writeStartObject();
			jsonGenerator.writeNumberField("firstValue", values.getFirstValue());
			jsonGenerator.writeNumberField("secondValue", values.getSecondValue());
			jsonGenerator.writeStringField("operator",values.getOperator());
			jsonGenerator.writeEndObject();
		
	}

}
