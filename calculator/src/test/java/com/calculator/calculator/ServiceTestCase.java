package com.calculator.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.calculator.calculator.bean.Calculator;
import com.calculator.calculator.service.CalcServiceIMPL;

public class ServiceTestCase {


		@Test
		  public void positiveAddTest() {
			CalcServiceIMPL calculatorService = new CalcServiceIMPL();
		    Calculator result = calculatorService.add(2, 2);

		    assertEquals(2, result.getNum1());
		    assertEquals(2, result.getNum2());
		    assertEquals(4, result.getResult());
		  }
		
		@Test
		  public void negativeAddTest() {
			CalcServiceIMPL calculatorService = new CalcServiceIMPL();
		    Calculator result = calculatorService.add(2, 2);


		    assertNotEquals(5, result.getResult());
		  }

		@Test
		  public void positiveSubtractTest() {
			CalcServiceIMPL calculatorService = new CalcServiceIMPL();
		    Calculator result = calculatorService.subtract(4, 1);

		    assertEquals(4, result.getNum1());
		    assertEquals(1, result.getNum2());
		    assertEquals(3, result.getResult());
		  }
		
		@Test
		  public void negativeSubtractTest() {
			CalcServiceIMPL calculatorService = new CalcServiceIMPL();
		    Calculator result = calculatorService.subtract(4, 1);

		    assertNotEquals(5, result.getResult());
		  }
		
		@Test
		  public void positiveMultiplyTest() {
			CalcServiceIMPL calculatorService = new CalcServiceIMPL();
		    Calculator result = calculatorService.multiply(2, 4);

		    assertEquals(2, result.getNum1());
		    assertEquals(4, result.getNum2());
		    assertEquals(8, result.getResult());
		  }
		
		@Test
		  public void negativeMultiplyTest() {
			CalcServiceIMPL calculatorService = new CalcServiceIMPL();
		    Calculator result = calculatorService.multiply(2,4);

		    assertNotEquals(88, result.getResult());
		  }
		
		
		@Test
		  public void positiveDivideTest() {
			CalcServiceIMPL calculatorService = new CalcServiceIMPL();
		    Calculator result = calculatorService.divide(8,2);

		    assertEquals(8, result.getNum1());
		    assertEquals(2, result.getNum2());
		    assertEquals(4, result.getResult());
		  }
		
		@Test
		  public void negativeDivideTest() {
			CalcServiceIMPL calculatorService = new CalcServiceIMPL();
		    Calculator result = calculatorService.divide(8, 2);

		    assertNotEquals(5, result.getResult());
		  }
		
		
		
	}

