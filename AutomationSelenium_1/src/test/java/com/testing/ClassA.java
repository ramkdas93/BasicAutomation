package com.testing;

import org.testng.annotations.Test;

public class ClassA {

	@Test (priority=3)
	public static void Test1() {
		System.out.println("Test 1");
	}
	
	@Test(priority=1)
	public static void Test2() {
		System.out.println("Test 2");
	}
	
	@Test (priority=2)
	public static void Test3() {
		System.out.println("Test 3");
	}
}
