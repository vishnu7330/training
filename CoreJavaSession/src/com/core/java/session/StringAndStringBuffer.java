package com.core.java.session;

public class StringAndStringBuffer {

	public static void main(String[] args) {

		StringBuffer buffer = new StringBuffer("Hello Bay Area ");
		int len = buffer.length();
		System.out.println("Length : " + len);

		int cap = buffer.capacity();
		System.out.println("Capacity : " + cap);

		for (int i = 0; i < 100; i++) {
			buffer.append(i);
		}

		System.out.println("Content: " + buffer.toString());

		len = buffer.length();
		System.out.println("Length : " + len);

		cap = buffer.capacity();
		System.out.println("Capacity : " + cap);

		stringBufferMethods();
	}

	private static void stringBufferMethods() {

		StringBuffer stringBuffer = new StringBuffer(20); // size specified here

		/** append() method **/
		stringBuffer.append("cat");
		System.out.println(stringBuffer);
		stringBuffer.append(5);
		System.out.println(stringBuffer);

		/** insert() method **/
		stringBuffer.insert(4, "dog");// index is 4
		System.out.println(stringBuffer);

		/** reverse() method **/
		stringBuffer.reverse();
		System.out.println(stringBuffer);

		/** delete() method **/
		stringBuffer.delete(0, 3); // start index and end index is given here
		System.out.println(stringBuffer);

		/** deleteCharAt() method **/
		stringBuffer.deleteCharAt(1);
		System.out.println(stringBuffer);

		/** replace() method **/
		// replaces a sequence of characters with another sequence of characters
		stringBuffer.replace(0, 1, "ba");
		System.out.println(stringBuffer);

		/** indexOf() method **/
		int index = stringBuffer.indexOf("a", 0);
		System.out.println("index: " + index);

		/** lastIndexOf() method **/
		index = stringBuffer.lastIndexOf("a", stringBuffer.length()); // searches backward from the specified index
		System.out.println("index: " + index);

		/** converting StringBuffer to String **/
		String content = stringBuffer.toString();
		System.out.println("content: " + content);

		/** equals() method **/
		boolean flag = stringBuffer.equals("baac"); // returns false
		System.out.println("flag: " + flag);

		flag = content.equals("baac");
		System.out.println("flag: " + flag);// returns true

	}

}
