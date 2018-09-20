package com.critical.calculator.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator_Controller {
	
	@Autowired
	private CalculatorService service;
	
	@RequestMapping(method=RequestMethod.POST, value="/calculate")
	public CalculatorResponse calculate(@RequestBody Calculator values) {
		return service;
	}

}

