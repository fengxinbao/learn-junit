package com.feng;

import junit.framework.Test;
import junit.framework.TestSuite;

public class JUnit3Suite {

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(OneTimeRegularExpressionTest.suite());
		suite.addTestSuite(RegularExpressionTest.class);
		return suite;
	}
}