package com.feng;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import junit.extensions.TestSetup;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class OneTimeRegularExpressionTest extends TestCase {

	private static String zipRegEx = "^\\d{5}([\\-]\\d{4})?$";
	private static Pattern pattern;

	public static Test suite() {
		TestSetup setup = new TestSetup(new TestSuite(OneTimeRegularExpressionTest.class)) {
			protected void setUp() throws Exception {
				pattern = Pattern.compile(zipRegEx);
			}
		};
		return setup;
	}

	public void testZipCodeGroup() throws Exception {
		Matcher mtcher = pattern.matcher("22101-5051");
		boolean isValid = mtcher.matches();
		assertEquals("group(1) didn't equal -5051", "-5051", mtcher.group(1));
	}

	public void testZipCodeGroupException() throws Exception {
		Matcher mtcher = pattern.matcher("22101-5051");
		boolean isValid = mtcher.matches();
		try {
			mtcher.group(2);
			fail("No exception was thrown");
		} catch (IndexOutOfBoundsException e) {
		}
	}
}
