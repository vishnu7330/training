package com.session.unit.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTests {

	@Test
	public void testFindMaxWithPositiveValues() {
		System.out.println("test case find max with positive values");
		Calculation calc = new Calculation();
		assertNotNull(calc);
		assertEquals(4, calc.findMax(new int[] { 1, 3, 4, 2 }));
	}

	@Test
	public void testFindMaxWithNegativeValues() {
		System.out.println("test case find max with negative values");
		Calculation calc = new Calculation();
		assertNotNull(calc);
		assertEquals(-2, calc.findMax(new int[] { -12, -3, -4, -2 }));
	}
	
	@Test
	public void testFindMaxWithSameValues() {
		System.out.println("test case find max with same values");
		Calculation calc = new Calculation();
		assertNotNull(calc);
		assertEquals(4, calc.findMax(new int[] { 4, 4, 4, 4 }));
	}

	@Test
	public void testCube() throws InvalidDataException {
		System.out.println("test case cube");
		Calculation calc = new Calculation();
		assertNotNull(calc);
		assertEquals(27, calc.cube(3));
	}

	@Test
	public void testCubeWithNegativeValues() throws InvalidDataException {
		System.out.println("test case cube with negative values");
		Calculation calc = new Calculation();
		assertNotNull(calc);
		assertThrows(InvalidDataException.class, () -> calc.cube(-5));
	}

	@Test
	public void testReverseWord() {
		System.out.println("test case reverse word");
		Calculation calc = new Calculation();
		assertNotNull(calc);
		assertEquals("ym eman si nahk", calc.reverseWord("my name is khan"));
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("** before class **");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("++ before test ++");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("-- after test --");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("** after class **");
	}
}
