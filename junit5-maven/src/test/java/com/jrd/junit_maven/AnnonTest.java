package com.jrd.junit_maven;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class AnnonTest {
	
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();
	
	@Test
	public void createFolderRuleTest() {
		File folder = null;
		try {
			folder = this.folder.newFolder("MY_FOLDER");
			assertTrue(folder.exists());  // se eu quiser falhar só usar o !
		} catch (IOException e) {
			assertFalse(folder.exists());
		}
	}
	
	@BeforeClass
	public static void beforeClassTest() {
		System.out.println("@BeforeClass executed ");
	}
	
	@Before
	public void beforeTest() {
		System.out.println("@Before executed ");
	}
	
	@Test
//	@Ignore
	public void testOneTest() {
		System.out.println("@Test one executed ");
	}
	
	@Test
//	@Ignore
	public void testTwoTest() {
		System.out.println("@Test two executed ");
	}
	
	@Test(expected = ArithmeticException.class)
	public void divideIntegerByZero() {
		int number = 10 / 0;
	}
	
	
	
	@AfterClass
	public static void afterClassTest() {
		System.out.println("@AfterClass executed");
	}
	
	
	@After
	public void afterTest() {
		System.out.println("@After executed");
	}

}











