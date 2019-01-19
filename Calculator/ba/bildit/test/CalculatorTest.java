package ba.bildit.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ba.bildit.code.Calculator;

public class CalculatorTest{
	Calculator calculator;
	int rezultat;

	@Before
	public void setUp(){
		calculator = new Calculator();
	}
	
	@Test
	public void shouldReturnValueWhenSum(){
		rezultat = calculator.sabiranje(2, 4);
		assertEquals(6, rezultat);
	}
	
	@Test
	public void shouldReturnValueWhenSubstract(){
		rezultat = calculator.oduzimanje(4, 2);
		assertEquals(2, rezultat);
	}
	
	@Test
	public void shouldReturnValueWhenMultiply(){
		rezultat = calculator.mnozenje(2, 4);
		assertEquals(8, rezultat);
	}
	
	@Test
	public void shouldReturnSumWhenDivide(){
		rezultat = calculator.dijeljenje(4, 2);
		assertEquals(2, rezultat);
	}

}
