package com.feng.junit4wiki;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class LoggingRule implements TestRule{

	public LoggingRule(String string) {
	}

	@Override
	public Statement apply(Statement base, Description description) {
		return null;
	}

}
