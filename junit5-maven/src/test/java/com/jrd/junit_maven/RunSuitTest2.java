package com.jrd.junit_maven;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	SuiteCaseTest1.class,
	SuiteCaseTest2.class
})
public class RunSuitTest2 {

}
