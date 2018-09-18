package io.critical.start.calculator;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/** @Author: Paulo Simões
 *  @Classe- CalculateController
 */

//Rest Controller
@RestController
public class CalculatorController {
	
//Automatic dependency injection (eliminate the need of getters and setters)
	@Autowired
	private CalculatorService calculatorService;
	
	
//Request Mapping-Maps all HTTP operations by default
	@RequestMapping("/response")
    public List<String>getAllTopics() {
        return calculatorService.operations;
        
	}
	 
//Maps all operations for the Post Method 
		@RequestMapping(method=RequestMethod.POST, value="/calculate")
		
	    public calculateResponse Calculator (@Valid @RequestBody Calculator values) {
			

			
	        return calculatorService.calculateOperation(values);
	    }

		
	
}
