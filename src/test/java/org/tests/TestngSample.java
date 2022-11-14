package org.tests;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;

public class TestngSample   {

	@Test
	private void savings() {
		System.out.println("Method 1");
	}

	@Test(priority = 0, invocationCount = 2)
	private void fixed() {
		System.out.println("Method 2");
	}

	@Test(priority = -1, enabled = false)
	private void deposit() {
		System.out.println("Method 3");
	}

	@Test(priority = 2, invocationCount = 2)
	private void recurrent() {
		System.out.println("Method 4");
	}

}
