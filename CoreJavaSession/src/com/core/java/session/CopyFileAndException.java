package com.core.java.session;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileAndException {

	public static void main(String args[]) {

		CopyFileAndException testObject = null;

		// testObject.testMethod();

		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			// reading
			in = new FileInputStream(
					"C:\\Users\\tamil\\git\\training\\CoreJavaSession\\src\\com\\core\\java\\session\\input.txt");
			// writing
			out = new FileOutputStream("output.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}

			// alternate way
			// in.transferTo(out);

		} catch (FileNotFoundException fnfEx) {
			fnfEx.printStackTrace();
			System.out.println("Please provide a input.txt file");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Unknown Error");
			// based on the project requirement

		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("main method is exiting");

		testMethod();

	}

	public static void testMethod() {

		int x = 50;
		int y = 0;

//		System.out.println(x / y);
		throw new WebServiceNotAvailableException();

	}
}