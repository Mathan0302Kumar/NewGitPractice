package com.jsample;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({SampleJunit.class,Sample2Junit.class})
public class TestSample {
	public static void main(String[] args) {
		Result r = JUnitCore.runClasses(SampleJunit.class,Sample2Junit.class);
		
		int runCount = r.getRunCount();
		System.out.println(runCount);
		
		int failureCount = r.getFailureCount();
		System.out.println(failureCount);
		
		List<Failure> failures = r.getFailures();
		for (Failure failure : failures) {
			System.out.println(failure);			
		}	
		int ignoreCount = r.getIgnoreCount();
		System.out.println(ignoreCount);	
	}
	
	
	
	

}
