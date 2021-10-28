package com.app.ProvaIngSw_210410;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {
	
	@BeforeClass
	public static void startAllTests() {
		System.out.println("Orario di inizio di tutti i test: " + new DateTime().toString());
	}

	@AfterClass
	public static void endAllTests() {
		System.out.println("Orario di fine di tutti i test: " + new DateTime().toString());
	}
	
	@Before
	public void startSingleTest() {
		System.out.println("Orario di inizio di un test: " + new DateTime().toString());
	}
	
	@After
	public void endSingleTest() {
		System.out.println("Orario di fine di un test: " + new DateTime().toString());
	}
	
	@Test
	public void ascendingOrderingWorks() {
		assertEquals(Arrays.asList(new Integer[] {-14, -9, 3, 7, 10, 14, 20, 567}), new MyListUtil().sort(Arrays.asList(new Integer[] {20, -9, 3, 14, 567, 7, -14, 10}), 0));
	}
	
	@Test
	public void descendingOrderingWorks() {
		assertEquals(Arrays.asList(new Integer[] {567, 20, 14, 10, 7, 3, -9, -14}), new MyListUtil().sort(Arrays.asList(new Integer[] {20, -9, 3, 14, 567, 7, -14, 10}), 1));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void orderingThrowsException() {
		assertEquals(Arrays.asList(new Integer[] {567, 20, 14, 10, 7, 3, -9, -14}), new MyListUtil().sort(Arrays.asList(new Integer[] {20, -9, 3, 14, 567, 7, -14, 10}), -1));
	}
}
