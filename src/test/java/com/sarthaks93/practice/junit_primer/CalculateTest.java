package com.sarthaks93.practice.junit_primer;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.sarthaks93.practice.junit_primer.example.Calculate;

public class CalculateTest {
	
	@BeforeClass
	public static void logBeforeTest() {
		System.out.println("Starting tests");
	}
	
	@AfterClass
	public static void logAfterTest() {
		System.out.println("Ending tests");
	}

	@Test
	public void addTest() {
		assertEquals(3, Calculate.add(1, 2));
	}
	
	@Test
	public void findMaxTest() {
		Calculate c = new Calculate();
		assertEquals(3, c.findMax());
	}

}
