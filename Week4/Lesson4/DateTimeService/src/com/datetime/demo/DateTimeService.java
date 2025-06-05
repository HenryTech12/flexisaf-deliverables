package com.datetime.demo;

import java.util.Scanner;
import java.util.Date;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.Instant;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import java.util.Iterator;
import java.time.Month;
import java.time.YearMonth;

public class DateTimeService {
	
	public static void main(String[] args) {
	   
		lengthInMonth();
		getMondayInMonth();
		occursOn();
		
	}
	
	public static void lengthInMonth() {
		  
		 
	   Scanner sc = new Scanner(System.in);
		 
			 Map<String, Integer> monthCounter = new HashMap<>();
		   System.out.println("Enter Year: ");
			 int year = sc.nextInt();
			 sc.nextLine();
			  for(Month m :Month.values()) {
			     YearMonth yMonth = YearMonth.of(year,m);
				   System.out.println("Month:  "+m+", Each Length In Month: "+yMonth.lengthOfMonth());
			  }
			 
		}
		
	public static void getMondayInMonth() {
		 Scanner sc = new Scanner(System.in);
		 List<LocalDate> listOfMonday = new ArrayList<>();
	  
		   System.out.println("Enter Month Value: ");
			 int month = sc.nextInt();
			 
			
			 LocalDate date = LocalDate.of(2025,month,1);
			 			
			 while(date.getMonthValue() == month) {
				 // System.out.println("yo");
				DayOfWeek dayofweek = date.getDayOfWeek();
			  if(dayofweek == DayOfWeek.MONDAY) {
			       listOfMonday.add(date);	
				 }
				 date = date.plusDays(1);
			}
		  System.out.println("Result For List Of All Monday Is: ");
		  for(LocalDate monday: listOfMonday) {
		   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			 String formattedDate = monday.format(formatter);
			
			 
			 System.out.println("Formatted Date: "+formattedDate);
			 DayOfWeek dayofweek = monday.getDayOfWeek();
			 System.out.println("DayOfWeek: ( "+monday.getDayOfMonth()+" ): "+dayofweek.name());
			 System.out.println("Month: ( "+monday.getMonthValue()+" ): "+monday.getMonth().name());
			 System.out.println("Year: "+monday.getYear());
			 System.out.println();
		   
		 }
	}
	
	public static void occursOn() {
	 
		Scanner sc = new Scanner(System.in);
		 
	  System.out.println("Pass In Date Values:");
		System.out.println("Enter Year: ");
		int year = sc.nextInt();
		
		System.out.println("Enter Month[1-12]: ");
		int month = sc.nextInt();
		
		System.out.println("Enter Day: ");
		int day = sc.nextInt();
		
		LocalDate date = LocalDate.of(year,month,day);
		
		
		DayOfWeek dayofweek = date.getDayOfWeek();
		
		System.out.println("For Provided Date: "+date);
		System.out.println("Our System Shows The Result Below: ");
		System.out.println("  DayOfWeek: "+dayofweek.name());
		System.out.println("  Month: "+date.getMonth().name());
		System.out.println("  Day: "+day);
		boolean occurs = (day == 13 && dayofweek.name().equalsIgnoreCase("friday"));
	      System.out.println("  Occurs On Friday(13th) : "+occurs);
	}
}