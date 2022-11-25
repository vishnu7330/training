package com.core.java.session.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XMLValidator {

	public static void main(String[] args) {
		// parse an XML document into a DOM tree
		DocumentBuilder parser = null;
		try {
			parser = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		} catch (ParserConfigurationException e1) {
			e1.printStackTrace();
		}
		Document document = null;
		try {
			document = parser.parse(new File("question.xml"));
		} catch (SAXException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		// create a SchemaFactory capable of understanding WXS schemas
		SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

		// load a WXS schema, represented by a Schema instance
		Source schemaFile = new StreamSource(new File("question.xsd"));
		Schema schema = null;
		try {
			schema = factory.newSchema(schemaFile);
		} catch (SAXException e1) {
			e1.printStackTrace();
		}

		// create a Validator instance, which can be used to validate an instance
		// document
		Validator validator = schema.newValidator();

		// validate the DOM tree
		try {
			validator.validate(new DOMSource(document));
			System.out.println("Input XML document is valid");
		} catch (SAXException e) {
			// instance document is invalid!
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
