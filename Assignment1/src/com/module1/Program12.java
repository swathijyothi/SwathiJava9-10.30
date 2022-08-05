package com.module1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Program12 {
	public static void main(String[] args) {
		Date d= new Date();
		System.out.println("System time:"+d);
		LocalDate d1= LocalDate.now();
		System.out.println("\n current date:"+d1);
		LocalTime d2=LocalTime.now();
		System.out.println("\n current time:"+d2);
		LocalDateTime d3=LocalDateTime.now();
		System.out.println("\n current date and time:"+d3);
		DateTimeFormatter d4= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String d5=d3.format(d4);
		System.out.println("\n formatted date:"+d5);
	}

}
