package com.core.java.session.interfaces;

public class Student implements StudentInterface {

	// implementation for the method defined in Interface
	// Annotation
	@Override
	public String getGrade() {
		return "Topper";
	}

	// implementation for the method defined in Interface
	@Override
	public int getAge() {
		return 15;
	}

	// main method
	public static void main(String[] args) {
		StudentInterface student = new Student();
//		StudentInterface student = new StudentDetails();
		System.out.println("Grade: " + student.getGrade());
		System.out.println("Age: " + student.getAge());
		System.out.println("constant DAY: " + DAY); // also write like Student.DAY
		
		/**
		 * fields in Interface are static and final by default can not assign value
		 * again
		 */
		// DAY = "Monday"; //uncommenting this throws error
	}
	
	//public abstract void testMethod() ;
}
