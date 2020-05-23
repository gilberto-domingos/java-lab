package com.jrd.junit_maven;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	AnnonTest.class,
	AssertTest.class,
	StringUtilsTest.class
})
public class RunSuiteTest {

}
