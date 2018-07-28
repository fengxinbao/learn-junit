package com.feng.junit4wiki;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeThat;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class UserTest {
	@DataPoint
	public static String GOOD_USERNAME = "optimus";
	@DataPoint
	public static String USERNAME_WITH_SLASH = "optimus/prime";

	@Theory
	public void filenameIncludesUsername(String username) {
		assumeThat(username, not(containsString("/")));
		assertThat(new User(username).configFileName(), containsString(username));
	}
}