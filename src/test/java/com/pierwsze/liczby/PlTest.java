package com.pierwsze.liczby;

import static org.junit.Assert.*;
import org.junit.Test;


public class PlTest {
	
	@Test
	public void TestFrom2to20() {
		
		Sprawdz objectUnderTest = new Sprawdz();
		String expectedString = "2 3 5 7 11 13 17 19 ";
		assertEquals(expectedString, objectUnderTest.Go("2", "20"));
	}
	
	@Test
	public void TestFrom20to100() {
		
		Sprawdz objectUnderTest = new Sprawdz();
		String expectedString = "23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 ";
		assertEquals(expectedString, objectUnderTest.Go("20", "100"));
	}
	
	@Test
	public void TestNull() {
		
		Sprawdz objectUnderTest = new Sprawdz();
		String expectedString = "";
		assertEquals(expectedString, objectUnderTest.Go("2", ""));
	}
	
	@Test
	public void TestNumberFormatException() {
		
		Sprawdz objectUnderTest = new Sprawdz();
		String expectedString = "";
		assertEquals(expectedString, objectUnderTest.Go("fgs", "100"));
	}
}
