package com.core.java.session.xml;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParserHandler extends DefaultHandler {

	private StringBuilder currentValue = new StringBuilder();

	List<Student> students;
	Student currentStudent;

	public List<Student> getStudents() {
		return students;
	}

	@Override
	public void startDocument() {
		students = new ArrayList<Student>();
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) {

		// reset the tag value
		currentValue.setLength(0);

		// start of loop
		if (qName.equalsIgnoreCase("student")) {

			// new student
			currentStudent = new Student();

			// student rollno
			String rollno = attributes.getValue("rollno");
			currentStudent.setRollno(rollno);
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) {

		if (qName.equalsIgnoreCase("firstname")) {
			currentStudent.setFirstname(currentValue.toString());
		}

		if (qName.equalsIgnoreCase("lastname")) {
			currentStudent.setLastname(currentValue.toString());
		}

		if (qName.equalsIgnoreCase("nickname")) {
			currentStudent.setNickname(currentValue.toString());
		}

		if (qName.equalsIgnoreCase("marks")) {
			currentStudent.setMarks(Integer.parseInt(currentValue.toString()));
		}

		// end of loop
		if (qName.equalsIgnoreCase("student")) {
			students.add(currentStudent);
		}

	}

	@Override
	public void characters(char ch[], int start, int length) {
		currentValue.append(ch, start, length);

	}

}
