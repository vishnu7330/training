package com.core.java.session;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileAndException {

	public static void main(String args[])  {
		
		
		CopyFileAndException testObject =  null;
		
		//testObject.testMethod();
		
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			//reading
			in = new FileInputStream("input.txt");
			//writing
			out = new FileOutputStream("output.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}

		} catch (IOException e) {
			//based on the project requirement
			System.out.println("Please provide a input.txt file");
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
	}

	private void testMethod() {
		// TODO Auto-generated method stub
		
	}
}