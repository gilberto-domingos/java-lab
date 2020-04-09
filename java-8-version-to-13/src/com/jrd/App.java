package com.jrd;


import java.util.Set;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		
		Integer status = 1;
		
		switch(status) {
			case 1 -> System.out.println("number 1");
			case 2 -> System.out.println("number 2");
			default -> {
				System.out.println("number 0");
			}
				
				
		
		
		}
	
		
		
		//--------------multilines------------------//
		/*	String multiline = """
				hello 
				world,
				very
				nice """;
	                    	System.out.println(multiline); */
		
	//------------------------set list--------------------------------//
		/*	Set<String>listSet = Set.of("a1", "a2", "a3", "a4");
		    System.out.println(listSet)  */
	
	//------------------stream iterate -------------------------//
	/*	Stream.iterate(2, number -> number * 2)
		.limit(30)
		.forEach(n -> System.out.println(n)); */
		
		
		//------------ stream ------------------//	
				/*	String str = "Hello \n" + "world";
				Stream<String>lines = str.lines();
				lines.forEach(System.out::println);  */
		
		

	}

}
