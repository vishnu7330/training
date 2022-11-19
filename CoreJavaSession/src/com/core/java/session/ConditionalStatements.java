package com.core.java.session;

public class ConditionalStatements {

	public static void main(String[] args) {

		int x = 5;

		/** if condition **/
		if (x < 10) {
			System.out.println("inside ** first if ** condition");
		}

		/** if-else condition **/
		int y = 10;
		if (y < 10) {
			System.out.println("inside ** if ** condition");
		} else {
			System.out.println("inside ** else ** condition");
		}

		/** switch-case condition **/

		int number = 2;

		switch (number) {

			case 1: {
				System.out.println("inside case 1");
			}
			case 2: {
				System.out.println("inside case 2");
			}
			case 3: {
				System.out.println("inside case 3");
			}
			case 4: {
				System.out.println("inside case 4");
			}
			case 5: {
				System.out.println("inside case 5");
				/** break stops the flow of execution **/
				break;
			}
			case 6: {
				System.out.println("inside case 6");
			}
			/** when no case is having a matching value then default is executed **/
			default:
				System.out.println("inside default");

		}

		/** while loop **/
		int i = 0;

		while (i < 5) {
			System.out.println("inside while loop i -> " + i);
			i++;
		}

		/** while loop with ** continue ** **/
		i = 0;
		while (i < 6) {
			if (i == 4) {
				i++;
				continue;
			}
			System.out.println("inside while loop with ** continue ** i -> " + i);
			i++;
		}
		
		/** while loop with ** break ** **/
		i = 0;
		while (i < 6) {
			if (i == 4) {
				break;
			}
			System.out.println("inside while loop with ** break ** i -> " + i);
			i++;
		}

		i = 10;
		do {
			System.out.println("inside do-while loop i -> " + i);
			i++;
		} while (i < 5);
		
		/** switch with return statement **/
		String day = getDay(8);
		System.out.println("Day: " + day);
	}
	
	
	public static String getDay(int number) {
		
		/** switch with return statement **/
		switch(number) {
			case 1:
				return "Sunday";
			case 2:
				return "Monday";
			case 3:
				return "Tuesday";
			case 4:
				return "Wednesday";
			case 5:
				return "Thursday";
			case 6:
				return "Friday";
			case 7:
				return "Saturday";
	
			default:
				return "Invalid number";
		}
	}
}
