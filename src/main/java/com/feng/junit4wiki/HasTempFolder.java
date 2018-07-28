package com.feng.junit4wiki;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class HasTempFolder {
	@Rule
	public final TemporaryFolder folder = new TemporaryFolder();

	@Test
	public void testUsingTempFolder() throws IOException {
		File createdFile = folder.newFile("myfile.txt");
		File createdFolder = folder.newFolder("subfolder");
		// ...
	}
}
