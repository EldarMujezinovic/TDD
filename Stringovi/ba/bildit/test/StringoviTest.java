package ba.bildit.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ba.bildit.code.Stringovi;

public class StringoviTest {
	
	Stringovi stringovi;
	int rezultat;
	String testStr;
	
	@Before
	public void setUp(){
		stringovi = new Stringovi();
	}
	
	@Test
	public void shouldReturnLengthOfString(){
		rezultat = stringovi.duzinaStringa("Strategija");
		assertEquals(10, rezultat);
	}
	
	@Test
	public void shouldReturnWordsOnEvenPositions(){
		testStr = stringovi.parnePozicije("rapsodija");
		assertEquals("rpoia", testStr);
	}
	
	@Test
	public void shouldReturnWordsOnOddPositions(){
		testStr = stringovi.neparnePozicije("rapsodija");
		assertEquals("asdj", testStr);
	}
	
	@Test
	public void shouldReturnNumberOfUpperCaseCharacters(){
		rezultat = stringovi.upperCase("LoGiKaNeKa");
		assertEquals(5, rezultat);
	}
	
	@Test
	public void shouldReturnNumberOfLowerCaseCharacters(){
		rezultat = stringovi.lowerCase("LoGiKaNeKa");
		assertEquals(5, rezultat);
	}
	
	@Test
	public void shoultReturnSveOsimKaraktera(){
		testStr = stringovi.ostaliKarakteri("kroko3$!#");
		assertEquals("3$!#", testStr);
	}
	
	

}
