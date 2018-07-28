package com.feng;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
 
@RunWith(Suite.class)
@SuiteClasses({
			ParametricRegularExpressionTest.class,
      RegularExpressionTest.class,
      TimedRegularExpressionTest.class})
public class JUnit4Suite {
 
}