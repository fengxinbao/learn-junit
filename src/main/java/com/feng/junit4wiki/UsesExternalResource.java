package com.feng.junit4wiki;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

public class UsesExternalResource {
	Server myServer = new Server();

	@Rule
	public final ExternalResource resource = new ExternalResource() {
		@Override
		protected void before() throws Throwable {
			myServer.connect();
		};

		@Override
		protected void after() {
			myServer.disconnect();
		};
	};

	@Test
	public void testFoo() {
		new Client().run(myServer);
	}
}
