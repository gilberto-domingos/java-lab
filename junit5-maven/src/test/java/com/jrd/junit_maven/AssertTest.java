package com.jrd.junit_maven;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static com.jrd.junit_maven.isEmptyString.*;
import static com.jrd.junit_maven.DivisibleBy.*;

public class AssertTest {
     
	   @Test
	   public void testAssert() {
		   String str1 = "Junit";
		   String str2 = "Junit";
		   
		   assertEquals(str1,str2);		   
	   }
	   
	   @Test
	   public void testAssert2() {
		   String str3 = "Junit";
		   String str4 = "Junit";
		   
		   assertThat(str3, is("Junit"));  
		   assertThat(str4, isA(String.class));   		   
	   }
	   
	   @Test
	   public void testAsserInt() {
		   Integer  int1 = 01;
		   Integer  int2 = 02;
		   
		   assertNotSame(int1,int2);	   
	   }
	   
	   @Test
	   public void testAssertArr() {
		   int [] array1 = {1,2,3,4};
		   int [] array2 = {1,2,3,4};
		   
		   assertArrayEquals(array1, array2);
	   }
	   
	   @Test
	   public void testAssertEmpty() {
		   String tst = ""; 
		   
		   assertThat(tst, is(isEmpty(tst)));
		  
	   }
	   
	  @Test
	  public void divisibleBy() {
		  Integer tst2 = 5;
		  
		 assertThat(tst2, is(divisible(2)));
	  }
	   
	   
	   
}








