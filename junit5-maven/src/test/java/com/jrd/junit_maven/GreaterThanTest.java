package com.jrd.junit_maven;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Assert.*;

@RunWith(Parameterized.class)
public class GreaterThanTest {

	private GreaterThan validate;
	private Boolean exResult;
	private Integer inputNumber;
	
	public GreaterThanTest(Integer inputNumber, Boolean exResult) {
		this.inputNumber = inputNumber;
		this.exResult = exResult;
	}
	
	@Before
	public void initialize() {
		this.validate = new GreaterThan();
	}
	
	
	@Parameters
	public static Collection setNumbers() {
		return Arrays.asList(new Object[][] {
			{ 10, true },
			{ 50, true },
			{ 1, false },
			{ 2, false },
			{ 4, false }
		});
	}
	
	@Test
	public void greaterThenTest() {
		System.out.println("Testing..");
		assertEquals(this.exResult, validate.validate(this.inputNumber));
	}
	
	@After
	public void close() {
		this.validate = null;
	}
}