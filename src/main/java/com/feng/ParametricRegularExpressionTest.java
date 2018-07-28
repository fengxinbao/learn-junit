package com.feng;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParametricRegularExpressionTest {
	private static String zipRegEx = "^\\d{5}([\\-]\\d{4})?$";
	private static Pattern pattern;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		pattern = Pattern.compile(zipRegEx);
	}

	@Test
	public void verifyGoodZipCode() throws Exception {
		Matcher mtcher = pattern.matcher(phrase);
		boolean isValid = mtcher.matches();
		assertEquals("Pattern did not validate zip code", isValid, match);
	}

	@Parameters
	public static Collection<Object[]> regExValues() {
		return Arrays.asList(
				new Object[][] { { "22101", true }, { "221x1", false }, { "22101-5150", true }, { "221015150", false } });
	}

	private String phrase;
	private boolean match;

	public ParametricRegularExpressionTest(String phrase, boolean match) {
		this.phrase = phrase;
		this.match = match;
	}

}
