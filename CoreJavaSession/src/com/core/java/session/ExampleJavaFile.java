/* Package name */
package com.core.java.session;

import java.util.Date;

/*
 * Copyright (C) 2022 The Android Open Source Project 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */

/* Class definition */
/* public keyword is a modifier it can be private or final */

public class ExampleJavaFile {

	/* Variables */
	private String message = "This is an example class";

	/* Constructor */
	public ExampleJavaFile() {
		super();
	}

	/* Getter and Setter methods */
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/* Methods */

	/**
	 * This method will print the message received.
	 */
	public void printMessage() {
		System.out.println("called from class method. " + getMessage());
	}

	/* main method *** NOT REQUIRED IN ALL THE CLASSES ***/
	public static void main(String[] args) {
		//Program execution starts
		System.out.println("This is called from main() method...");

		/* Creating Objects */
		ExampleJavaFile exampleObject = new ExampleJavaFile();

		/* Calling method using Object */
		exampleObject.printMessage();
		
		exampleObject.setMessage("new message");
		
		exampleObject.printMessage();

		Date date = new Date();
		System.out.println(date.toString());
		//Program execution ends
	}

}
