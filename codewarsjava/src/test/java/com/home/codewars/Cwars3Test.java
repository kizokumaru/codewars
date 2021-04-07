package com.home.codewars;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
class Cwars3Test {
	private static final Logger LOGGER = Logger.getLogger("com.home.codewars.AppTest");

	@Test
	public void testBasic0() {
		LOGGER.info("TestBasic0");
		assertFalse(Cwars3.isPrime(0), "0  is not prime");
	}
	
	@Test
	public void testBasic1() {
		LOGGER.info("TestBasic1");
		assertFalse(Cwars3.isPrime(1), "1  is not prime");
	}

	@Test
	public void testBasic2() {
		LOGGER.info("TestBasic2");
		assertTrue(Cwars3.isPrime(2), "2  is prime");
	}

	@Test
	public void testBasic73() {
		LOGGER.info("TestBasic73");
		assertTrue(Cwars3.isPrime(73), "73 is prime");
	}

	@Test
	public void testBasic75() {
		LOGGER.info("TestBasic75");
		assertFalse(Cwars3.isPrime(75), "75 is not prime");
	}

	@Test
	public void testBasicminus1() {
		LOGGER.info("TestBasicminus1");
		assertFalse(Cwars3.isPrime(-1), "-1 is not prime");
	}

	@Test
	public void testPrime() {
		assertTrue(Cwars3.isPrime(3), "   3 is prime");
		assertTrue(Cwars3.isPrime(5), "   5 is prime");
		assertTrue(Cwars3.isPrime(7), "   7 is prime");
		assertTrue(Cwars3.isPrime(41), "  41 is prime");
		assertTrue(Cwars3.isPrime(5099), "5099 is prime");
	}

	@Test
	public void testNotPrime() {
		assertFalse(Cwars3.isPrime(4), "4 is not prime");
		assertFalse(Cwars3.isPrime(6), "6 is not prime");
		assertFalse(Cwars3.isPrime(8), "8 is not prime");
		assertFalse(Cwars3.isPrime(9), " 9 is not prime");
		assertFalse(Cwars3.isPrime(45), "45 is not prime");
		assertFalse(Cwars3.isPrime(-5), "-5 is not prime");
		assertFalse(Cwars3.isPrime(-8), "-8 is not prime");
		assertFalse(Cwars3.isPrime(-41), "-41 is not prime");
	}
}
