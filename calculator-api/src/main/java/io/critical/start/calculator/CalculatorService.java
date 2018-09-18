package io.critical.start.calculator;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.springframework.stereotype.Service;

import io.critical.start.exceptions.InvalidParametersException;

@Service
public class CalculatorService {
//List- Operations(+-avg*/)	
//String that list the available operations
	List<String> operations= new ArrayList<String>() {
		
		private static final long serialVersionUID = 1L;
		{
	
			add ("+");
			add ("-");
			add ("/");
			add ("*");
		}};
		
// Method calculateOperation- Compute two numbers depending of the operation		
		public calculateResponse calculateOperation (Calculator values) {
			double result = 0;
			switch (values.getOperator()) {
			case "+":
				
				
				result = values.getFirstValue() +  values.getSecondValue();			
				break;
				
			case "-":
				
				
				result = values.getFirstValue() -  values.getSecondValue();
				break;
				
			case "avg":
				
				result= (values.getFirstValue() + values.getSecondValue())/2;
				break;
				
			case "*":
				
				result = values.getFirstValue() *  values.getSecondValue();
				break;
				
			case "/":
					if ((values.getFirstValue() == 0) && (values.getSecondValue() == 0))
						throw new AcceptParametersException("Not a number!");
					if ((values.getSecondValue()== 0 )) 
						throw new AcceptParametersException("It is not possible to say how much this division is worth, which is considered an indeterminacy!");
				
				result = values.getFirstValue() /  values.getSecondValue();
				break;
				
			default:
				throw new InvalidParametersException("Add a correct operation: +,-, avg, *, /");
				
			}
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			
// New response calculated			
			calculateResponse newResponse = new calculateResponse (dateFormat.format(new Date()),result);
			return newResponse;
		}
		

}
