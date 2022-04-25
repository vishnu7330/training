package com.core.java.session;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println();
		System.out.println("input value: " + i);

		Scanner scan = null;
		try {
			scan = new Scanner(new File(
					"C:\\Users\\tamil\\git\\training\\CoreJavaSession\\src\\com\\core\\java\\session\\myNumbers.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (scan.hasNextLong()) {
			long aLong = scan.nextLong();
			System.out.println(aLong);
		}

		usingDelimiter();
	}

	private static void usingDelimiter() {
		System.out.println("/** delimiter **/");
		String input = "1 fish 2 fish red fish blue fish";
		Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
		System.out.println(s.nextInt());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.next());
		s.close();
	}

}
