package com.core.java.session;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateAndTime {

	public static void main(String[] args) {
		// Get the local date
		final LocalDate date = LocalDate.now();
		System.out.println("local date :" + date);

		// Get the local time
		final LocalTime time = LocalTime.now();
		System.out.println("local time : " + time);

		// Get the local date/time
		final LocalDateTime datetime = LocalDateTime.now();
		System.out.println("local datetime : " + datetime);

		// Get duration between two dates
		final LocalDateTime from = LocalDateTime.of(2022, Month.APRIL, 16, 0, 0, 0);
		final LocalDateTime to = LocalDateTime.of(2022, Month.APRIL, 16, 23, 59, 59);

		final Duration duration = Duration.between(from, to);
		System.out.println("duration : " + duration);

		long then = System.currentTimeMillis();
		pause();
		long now = System.currentTimeMillis();

		System.out.println("Method execution time: " + (now - then) / 1000 + " seconds");

		/** deprecated **/
//		java.util.Date
//		java.util.Calendar

	}

	private static void pause() {
		try {
			//milliseconds
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
