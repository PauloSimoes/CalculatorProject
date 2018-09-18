/*package io.critical.start.calculator.tests;
import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.MediaType;

import io.critical.start.calculator.Calculator;
import io.critical.start.calculator.CalculatorController;
import io.critical.start.calculator.CalculatorService;
import io.critical.start.calculator.calculateResponse;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration
@WebAppConfiguration
public class CalculatorControllerTests {
	
	
	@Mock
    private CalculatorService calculatorService;

    @InjectMocks
    private CalculatorController calculatorController;
    
    @Test
	public void testEvaluatesentValues() {
		when(calculatorService.calculateOperation(8.0);
		assertEquals(24, calculateOperation());
	}

    
    public void test_create_calc_sucess() throws Exception {
        Calculator calculator = new Calculator();

        when(calculatorService.calculateOperation(null)).thenReturn(false);
        doNothing().when(calculatorService).create(calculate));

        Object mockMvc;
		mockMvc.perform(
                post("/calculate")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(calculate)))
                .andExpect(status().isCreated())
                .andExpect(header().string("location", containsString("http://localhost/calculate/")));

        verify(calculatorService, times(1)).exists();
        verify(calculatorService, times(1)).create(user);
        verifyNoMoreInteractions(calculatorService);
    
    
    }
*/