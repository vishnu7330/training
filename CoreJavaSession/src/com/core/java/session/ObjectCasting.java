package com.core.java.session;

public class ObjectCasting extends A {

	public static void main(String[] args) {

		/** IMPLICIT casting **/
		implicitTypeCasting();

		/** EXPLICIT casting **/
		explicitTypeCasting();

		/** instance of **/
		instanceOfChecking();

		/** exception while casting objects **/
		exceptionWhileCasting();
	}

	/*
	 * byte -> short -> int -> long -> float -> double
	 * ================================================> Widening -> No data loss
	 *
	 * Automatic type conversion can happen if both type are compatible and target
	 * type is larger than source type.
	 */
	private static void implicitTypeCasting() {
		/** IMPLICIT casting **/
		byte i = 50;
		// No casting needed for below conversion
		short j = i;
		int k = j;
		long l = k;
		float m = l;
		double n = m;
		System.out.println("** IMPLICIT casting **");
		System.out.println("byte value : " + i);
		System.out.println("short value : " + j);
		System.out.println("int value : " + k);
		System.out.println("long value : " + l);
		System.out.println("float value : " + m);
		System.out.println("double value : " + n);
	}

	/*
	 * double -> float -> long -> int -> short -> byte
	 * ================================================> Narrowing -> data loss
	 *
	 * Automatic type conversion can happen if both type are compatible and target
	 * type is larger than source type.
	 */
	private static void explicitTypeCasting() {
		/** EXPLICIT casting **/
		double d = 75.25;
		// Explicit casting is needed for below conversion
		float f = (float) d;
		long l = (long) f;
		int i = (int) l;
		short s = (short) i;
		byte b = (byte) s;

		System.out.println("** EXPLICIT casting **");
		System.out.println("double value : " + d);
		System.out.println("float value : " + f);
		System.out.println("long value : " + l);
		System.out.println("int value : " + i);
		System.out.println("short value : " + s);
		System.out.println("byte value : " + b);
	}

	private static void instanceOfChecking() {
		ObjectCasting object = new ObjectCasting();

		if (object instanceof ObjectCasting) {
			System.out.println("--> found instance of class ObjectCasting");
		}

		if (object instanceof A) {
			System.out.println("--> found instance of class A");
		}

		//A aObject = new A();
		
		//object = (ObjectCasting) aObject;
	}

	private static void exceptionWhileCasting() {
		Object i = Integer.valueOf(42);
		String s = (String) i;
	}

}
