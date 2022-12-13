package com.module2;

import java.sql.Time;
import java.time.LocalTime;

public class SystemTime {
	public static void main(String[] args) {
		Time t= new Time(0);
		System.out.println(t);
		LocalTime lt= LocalTime.now();
		System.out.println(lt);
	}

}
