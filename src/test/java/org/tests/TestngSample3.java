package org.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngSample3 {
	
@Parameters({"username1","password1"})
	@Test(priority = -1)
	private void deposit(String m,String n) {
	System.out.println(m);
	System.out.println(n);
		System.out.println("Method 8");
	}

	@Test(priority = 2, invocationCount = 3)
	private void recurrent() {
		System.out.println("Method 9");
	}


}
