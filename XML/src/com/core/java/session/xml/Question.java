package com.core.java.session.xml;

import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

//Annotation
@XmlRootElement
public class Question {

	private int id;
	private String questionname;
	private List<Answer> answers;

	public Question() {
	}

	public Question(int id, String questionname, List<Answer> answers) {
		super();
		this.id = id;
		this.questionname = questionname;
		this.answers = answers;
	}

	//Annotation
	@XmlElement
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlElement(name = "qname")
	public String getQuestionname() {
		return questionname;
	}

	public void setQuestionname(String questionname) {
		this.questionname = questionname;
	}

	@XmlElement
	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
}