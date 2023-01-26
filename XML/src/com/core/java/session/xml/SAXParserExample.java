package com.core.java.session.xml;

import java.io.File;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SAXParserExample {

	public static void main(String[] args) {

		System.out.println("\n****** SAX Parser example *******\n");

		try {

			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();

			// custom class *** NOT from SAX parser api/library
			SAXParserHandler handler = new SAXParserHandler();

			// input file
			File input = new File("resources\\input.xml");
			saxParser.parse(input, handler);

			// print all
			List<Student> students = handler.getStudents();
			students.forEach(System.out::println);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
