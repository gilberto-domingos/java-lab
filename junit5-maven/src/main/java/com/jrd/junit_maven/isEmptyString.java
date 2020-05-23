package com.jrd.junit_maven;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeDiagnosingMatcher;

public class isEmptyString extends TypeSafeDiagnosingMatcher<String>   {

	private final String str;
	
	public isEmptyString(String str) {		
		this.str = str;
	}

	@Override
	public void describeTo(Description description) {
       description.appendText("A string is empty ");		
	}

	@Override
	protected boolean matchesSafely(String str, Description description) {
		
		Boolean result = str == "";
        
		description.appendText("String ").appendValue(str).appendText("is empty: ").appendValue(result);		
		return str != "";
	}
	
				 public static isEmptyString isEmpty(String str) {
					 return new isEmptyString(str);
				 }
  
}














