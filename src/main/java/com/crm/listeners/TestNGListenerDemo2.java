package com.crm.listeners;

import org.testng.annotations.Test;

public class TestNGListenerDemo2 {
	@Test
		public void test4(){
			System.out.println("I am inside test 1");
		}
		
		@Test
		public void test5(){
			System.out.println("I am inside test 2");
	//		Assert.assertTrue(false);
		}
		
		@Test
		public void test6(){
			System.out.println("I am inside test 3");
		}
}

