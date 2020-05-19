package com.jrd.junit_maven;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringUtilsTest {
	
	@Test
	public void StringIsEmpty() {
		
		boolean b;
		
		b = StringUtils.isEmpty("abc");
		Assert.assertFalse(b);
		
		b = StringUtils.isEmpty(null);
		Assert.assertTrue(b);
		
		b = StringUtils.isEmpty("");
		Assert.assertTrue(b);
		
	}
	
	@Test
	public void testReverse() {
		
		String r = StringUtils.reverse("abcd");
		Assert.assertEquals("dcba", r);
		
		r = StringUtils.reverse(null);
		Assert.assertNull(r);
		
	}
	
	@Before
	public void before() {
		System.out.println("Start my test");
	}
	
	@After
	public void after() {
		System.out.println("finished my test");
	}

}
