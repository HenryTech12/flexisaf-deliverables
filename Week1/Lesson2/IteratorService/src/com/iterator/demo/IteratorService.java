package com.iterator.demo;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class IteratorService {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Maddy");
		names.add("Henry");
		names.add("Mide");
		names.add("Jackie");
		
		System.out.println("Removing Data When Length Is Less Than: 5");
		System.out.println("Before: ");
		System.out.println();
		printList(names);
		
		removeDataIfLengthIsLessThan(names,5);
		System.out.println();
		System.out.println("After: ");
		printList(names);
		
		System.out.println();
		System.out.println("Removing Data When It Contains: ie");
		System.out.println("Before: ");
		printList(names);
		removeDataIfContains(names,"ie");
		System.out.println();
		System.out.println("After: ");
		printList(names);
		
		
		System.out.println();
		System.out.println("Removing Data When It Starts With: M");
		System.out.println("Before: ");
		printList(names);
		removeDataWhenStartsWith(names,'M');
		System.out.println();
		System.out.println("After: ");
		printList(names);
		
	}
	
	public static void removeDataIfLengthIsLessThan(List<String> list, int requiredLength) {
	    Iterator<String> it = list.iterator();
		  while(it.hasNext()) {
		     String data = it.next();
			   if(data.length() < requiredLength)
			      it.remove();
		  }    
	}
	
	public static void removeDataIfLengthIsGreaterThan(List<String> list, int requiredLength) {
	    Iterator<String> it = list.iterator();
		  while(it.hasNext()) {
		     String data = it.next();
			   if(data.length() > requiredLength)
			      it.remove();
		  }    
	}
	
	public static void removeDataIfLengthIsEqualTo(List<String> list, int requiredLength) {
	    Iterator<String> it = list.iterator();
		  while(it.hasNext()) {
		     String data = it.next();
			   if(data.length() == requiredLength)
			      it.remove();
		  }    
	}
	
	public static void removeDataWhenStartsWith(List<String> list, char startCharacter) {
	    Iterator<String> it = list.iterator();
		  while(it.hasNext()) {
		     String data = it.next();
			   if(data.startsWith(String.valueOf(startCharacter)))
			      it.remove();
		  }    
	}
	public static void removeDataIfEqualTo(List<String> list, String data) {
	    Iterator<String> it = list.iterator();
		  while(it.hasNext()) {
		     String values = it.next();
			   if(values.equals(data))
			      it.remove();
		  }    
	}
	
	
	public static void removeDataIfContains(List<String> list, String value) {
	  Iterator<String> it = list.iterator();
		  while(it.hasNext()) {
		     String data = it.next();
			   if(data.contains(value)) 
			      it.remove();
		  }    
	}
	
	public static void printList(List<String> list) {
	   Iterator<String> it = list.iterator();
		 String value = "";
		 while(it.hasNext()) {
		    value += it.next()+", ";
		 }
		 System.out.println("[ "+value+" ]");
	}
}