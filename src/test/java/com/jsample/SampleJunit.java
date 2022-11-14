package com.jsample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class SampleJunit {

	

	@Test
	public  void tc0() {
		System.out.println("This is Test 1");
	}
	
    @Ignore
	@Test
	public void tc1() {
		System.out.println("This is Test 2");

	}

	@Test
	public void tc2() {
		String S = "Maddy0302";
		System.out.println(S);
		Assert.assertTrue(false);
		System.out.println();
			}
	
	@Test
	public  void tc9() {
		String S = "Maddy";
		System.out.println("CSK");
		Assert.assertEquals("Sandy", S);
		System.out.println("Sandy");
	}
	

}
