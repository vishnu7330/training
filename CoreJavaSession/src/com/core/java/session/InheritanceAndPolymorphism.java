package com.core.java.session;

/** 
 * Polymorphism in Java is a concept by which we can perform a single action in different ways. 
 * Polymorphism is derived from 2 Greek words: poly and morphs. 
 * The word "poly" means many and "morphs" means forms. 
 * So polymorphism means many forms.
 *
 */
public class InheritanceAndPolymorphism {

	public static void main(String[] args) {

		Animal animal = new Animal(); // Create a Animal object

		
		//Runtime Polymorphism
		Animal pig = new Pig(); // Create a Pig object
		//Runtime Polymorphism
		Animal dog = new Dog(); // Create a Dog object

		/** Inheritance **/

		System.out.println(" age from animal Object : " + animal.getAge());
		System.out.println(" age from pig Object : " + pig.getAge());
		System.out.println(" age from dog Object : " + dog.getAge());

		/** Changing child class object's age **/
		pig.setAge(7);
		dog.setAge(9);

		System.out.println(" age from animal Object : " + animal.getAge());
		System.out.println(" age from pig Object : " + pig.getAge());
		System.out.println(" age from dog Object : " + dog.getAge());

		/********* METHOD OVERRIDING **********/

		/* method in Animal class is called */
		animal.animalSound();

		/* medhod in Pig class is called */
		pig.animalSound();

		/* method in Dog class is called */
		dog.animalSound();

		/********* METHOD OVERLOADING **********/
		//Compile time Polymorphism
		animal.animalSound(5);
		pig.animalSound(6);
		dog.animalSound(7);
	}
}
