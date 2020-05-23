package com.jrd.junit_maven;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.JVM)
public class SuiteCaseTest2 {
      
	@Test
	public void sub() {
		assertThat(2  - 2, is(0));
	}
	
	
	@Test
	public void mult() {
		assertThat(200 * 1254, is(250800));
	}
	
	
	
}
