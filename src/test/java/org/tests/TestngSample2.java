package org.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngSample2 {

	@Parameters({"username","password"})
	@Test(priority = 1, invocationCount = 2)
	private void savings1(String s,String s1) {
		System.out.println(s);
		System.out.println(s1);
		System.out.println("Method 4");
	}

	@Test(priority = 0, invocationCount = 1)
	private void fixed11() {
		System.out.println("Method 5");
	}

	@Test(priority = -1)
	private void deposit1() {
		System.out.println("Method 6");

	}
}
