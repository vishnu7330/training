package com.core.java.session;

/**
 *  Primitives
 * @author tamil
 *
 */
public class DataTypes {

	// Size - 1 byte -> -128 to 127
	public byte byteValue = 127;

	// Size - 2 bytes -> -32,768 to 32,767
	public short shortValue = 32767;

	// Size - 4 bytes -> -2,147,483,648 to 2,147,483,647
	public int intValue = 2147483647;

	// Size - 8 bytes -> -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	/*** suffix l is used to specify long ***/
	public long longValue = 9223372036854775807l;
	

	// Size - 4 bytes - can store 6 to 7 decimal digits
	/*** suffix f is used to specify float ***/
	public float floatValue = 3454.657657575f;
	

	// Size - 8 bytes - can store 15 decimal digits
	/*** suffix d is used to specify double ***/
	public double doubleValue = 12457878.787887d;
	

	// Size - **** 1 bit **** - true or false values
	public boolean booleanValue = true;

	// Size - 2 bytes - single character/letter or ASCII values
	public char charValue = 'A';

	// This is not primitive it is an object
	String myText = "Hello"; // String
	
}