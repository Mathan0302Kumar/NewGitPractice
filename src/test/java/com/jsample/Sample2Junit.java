package com.jsample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Sample2Junit {
	
	

	@Test
	public  void tc0() {
		System.out.println("This is Test 4");
	}
	
    @Ignore
	@Test
	public void tc1() {
		System.out.println("This is Test 5");

	}
    @Test
    public void tc06() {
		System.out.println("This is test 6");
	}
    @Test
    public void tc07() {
	Assert.assertTrue(false);
	System.out.println("This is test 07");
	}
    

}
