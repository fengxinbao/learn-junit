package com.feng;

import static org.junit.Assert.assertFalse;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.BeforeClass;
import org.junit.Test;

public class RegularExpressionJUnit4Test {
	private static String zipRegEx = "^\\d{5}([\\-]\\d{4})?$";
	private static Pattern pattern;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		pattern = Pattern.compile(zipRegEx);
	}

	@Test
	public void verifyZipCodeNoMatch() throws Exception {
		Matcher mtcher = this.pattern.matcher("2211");
		boolean notValid = mtcher.matches();
		assertFalse("Pattern did validate zip code", notValid);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void verifyZipCodeGroupException() throws Exception {
		Matcher mtcher = this.pattern.matcher("22101-5051");
		boolean isValid = mtcher.matches();
		mtcher.group(2);
	}

}
