package ba.bildit.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ba.bildit.code.Converter;

public class ConverterTest {
	Converter converter;
	double rezultat;
	
	@Before
	public  void setUp(){
	 converter = new Converter();

	}
	
	@Test
	public void shouldReturnPoundsWhenEnterKilos(){
	rezultat = converter.izKilogramaUFunte(10);
		assertEquals(22.046, rezultat, 0.00001);
	}
	
	@Test
	public void shouldReturnKilosWhenEnterPounds(){
	rezultat = converter.izFuntiUKilograme(10);
		assertEquals(22.046, rezultat, 0.00001);
	}
	@Test
    public void shouldReturnInchWhenEnterCm() {
	rezultat = converter.cmToInch(15);
	assertEquals(5.9055, rezultat, 4);
    }

    @Test
    public void shouldReturnCmWhenEnterInch() {
    rezultat = converter.inchToCm(2);
	assertEquals(4.08, rezultat, 4);
    }

    @Test
    public void shouldReturnFWhenEnterC() {
    rezultat = converter.cToF(5);
	assertEquals(41, rezultat, 0.00001);
    }

    @Test
    public void shouldReturnCWhenEnterF() {
    rezultat = converter.fToC(41);
	assertEquals(5, rezultat, 0.00001);
    }
	
	
}


