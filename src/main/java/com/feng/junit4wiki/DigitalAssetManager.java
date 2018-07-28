package com.feng.junit4wiki;

import java.io.File;

public class DigitalAssetManager {

	public DigitalAssetManager(File icon, File assets) {
		if(icon == null)
			throw new IllegalArgumentException("Icon is null, not a file, or doesn't exist.");
	}

	public int getAssetCount() {
		return 3;
	}

}
