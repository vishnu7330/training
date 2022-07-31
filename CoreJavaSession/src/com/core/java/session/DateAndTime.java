package com.core.java.session;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

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

		zonedDateTime();

	}

	private static void zonedDateTime() {
		ZonedDateTime zdt = null;
		Instant instant = Instant.now();
		DateTimeFormatter formatter = DateTimeFormatter.ISO_TIME;
		System.out.println("+++++++++++++++++++++++++++++++++++");

		// Eastern time
		String est = ZoneOffset.SHORT_IDS.get("EST");
		zdt = instant.atZone(ZoneId.of(est));
		System.out.println("EST TIME:*************** " + formatter.format(zdt));

		zdt = instant.atZone(ZoneId.of("US/Eastern"));
		System.out.println("EST TIME: " + formatter.format(zdt));
		// Eastern time - another way
		zdt = ZonedDateTime.now(ZoneId.of("UTC-04:00"));
		System.out.println("UTC-04:00 -> " + zdt);
		System.out.println("EST TIME: " + formatter.format(zdt));
		System.out.println("+++++++++++++++++++++++++++++++++++");

		String pst = ZoneOffset.SHORT_IDS.get("PST");
		zdt = instant.atZone(ZoneId.of(pst));
		System.out.println("PST : " + zdt);
		System.out.println("PST TIME: " + formatter.format(zdt));
		System.out.println("+++++++++++++++++++++++++++++++++++");

		// Central time
		String cst = ZoneOffset.SHORT_IDS.get("CST");
		zdt = instant.atZone(ZoneId.of(cst));
		System.out.println("CST : " + zdt);
		System.out.println("CST TIME: " + formatter.format(zdt));
		System.out.println("+++++++++++++++++++++++++++++++++++");
		// Central time - another way
		ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC-05:00"));
		System.out.println("UTC-05:00 -> " + utc);

		// India time
		String ist = ZoneOffset.SHORT_IDS.get("IST");
		zdt = instant.atZone(ZoneId.of(ist));
		System.out.println("IST : " + zdt);
		System.out.println("IST TIME: " + formatter.format(zdt));
		System.out.println("+++++++++++++++++++++++++++++++++++");
		// India time - another way
		ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT+05:30"));
		System.out.println("GMT+05:30 -> " + gmt);
	}

	private static void pause() {
		try {
			// milliseconds
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
