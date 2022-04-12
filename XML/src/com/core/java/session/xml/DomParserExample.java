package com.core.java.session.xml;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class DomParserExample {

	private static List<Student> students = new ArrayList<Student>();
			
	public static void main(String[] args) {

		
		try {
			//input file
			File inputFile = new File("resources\\input.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			
			//parsing - loading the xml file to memory
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("student");
			System.out.println("----------------------------");
			
			//iterate through the elements
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					
					Student student = new Student();
					
					Element eElement = (Element) nNode;
					System.out.println("Student roll no : " + eElement.getAttribute("rollno"));
					student.setRollno(eElement.getAttribute("rollno"));
					
					
					System.out.println(
							"First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
					student.setFirstname(eElement.getElementsByTagName("firstname").item(0).getTextContent());
					
					System.out.println(
							"Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
					student.setLastname(eElement.getElementsByTagName("lastname").item(0).getTextContent());
					
					System.out.println(
							"Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
					student.setNickname(eElement.getElementsByTagName("nickname").item(0).getTextContent());
					
					
					System.out.println("Marks : " + eElement.getElementsByTagName("marks").item(0).getTextContent());
					String marksValue = eElement.getElementsByTagName("marks").item(0).getTextContent();
					student.setMarks(Integer.parseInt(marksValue));
					
					students.add(student);
				}
				
				for (Iterator iterator = students.iterator(); iterator.hasNext();) {
					Student student = (Student) iterator.next();
					System.out.println(student);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}