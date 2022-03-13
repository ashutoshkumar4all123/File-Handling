package com.file.operations;

public class LockedMeMain {

	public static void main(String[] args) {

		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");

		MenuOptions.printWelcomeScreen("File Handling Program", "Ashutosh Kumar");

		HandleOptions.handleWelcomeScreenInput();
	}

}
