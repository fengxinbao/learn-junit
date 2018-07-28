package com.feng.junit4wiki;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestMethodOrder {
	@Test
	public void testA() {
		System.out.println("first");
	}

	@Test
	public void testB() {
		System.out.println("second");
	}

	@Test
	public void testC() {
		System.out.println("third");
assertThat(3, is(3));
	}

}
