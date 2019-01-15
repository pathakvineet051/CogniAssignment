package com.cogni.vineet.calcumation;

import org.junit.Test;

import junit.framework.TestCase;

public class TestCalcumation extends TestCase {
	
	
	@Test
    public void testCalcumation() {
		Calculation cal = new Calculation();
		int actualResult = cal.addition(5, 10);
		int expectedResult = 15;
		assertEquals(expectedResult, actualResult);
	}
	

}
