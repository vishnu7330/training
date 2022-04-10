package com.training.web.service.test;

import com.training.web.service.PeopleImpl;
import com.training.web.service.PeopleImplService;

public class WebServiceTest {

	public static void main(String[] args) {

		//code to be used by other companies
		PeopleImplService webservice = new PeopleImplService();
		PeopleImpl people = webservice.getPeopleImpl();

		int age = people.getAge();

		System.out.println("Age from webservice : " + age);
	}

}
