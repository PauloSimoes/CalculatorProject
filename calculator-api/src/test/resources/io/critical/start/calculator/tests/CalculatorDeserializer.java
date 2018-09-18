package io.critical.start.calculator.tests;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import io.critical.start.calculator.Calculator;



public class CalculatorDeserializer extends JsonDeserializer<Calculator> {
	
	@Override
	public Calculator deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
		ObjectCodec objectCodec = jsonParser.getCodec();
		JsonNode jsonNode= objectCodec.readTree(jsonParser);
		Calculator values = new Calculator();
		values.setFirstValue(jsonNode.get("firstValue").asDouble());
		values.setSecondValue(jsonNode.get("secondValue").asDouble());
		values.setOperator(jsonNode.get("operator").asText());
		return values;
	}

}
