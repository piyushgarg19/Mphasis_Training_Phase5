package com.example;

import org.testng.annotations.Test;

public class NewTest {

	@Test(groups = {"smoke"})
	public void test1() {
		System.out.println("this is test 1");
	}
	
	
	@Test(groups = {"smoke","functional"})
	public void test2() {
		System.out.println("this is test 2");
	}
	
	
	@Test(groups = {"regression"})
	public void test3() {
		System.out.println("this is test 3");
	}

}


