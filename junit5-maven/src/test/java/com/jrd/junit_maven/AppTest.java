package com.jrd.junit_maven;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AppTest{
	public static void main( String[] args ) {

    	Result result = JUnitCore.runClasses(GreaterThanTest.class);
    	
    	for (Failure failure : result.getFailures()) {
    		System.out.println(failure.toString());
    	}
    	
    	System.out.println(result.wasSuccessful());
    }
}
