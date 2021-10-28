package com.app.ProvaIngSw_210410;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class MyListUtilTest {

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
