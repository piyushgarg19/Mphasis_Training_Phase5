package com.example;

import org.testng.annotations.Test;

public class NewTest1 {
	@Test(groups = {"sanity"})
	public void test4() {
		System.out.println("this is test 4");
	}
	
	
	@Test(groups = {"regression","functional"})
	public void test5() {
		System.out.println("this is test 5");
	}
	
	
	@Test(groups = {"smoke","sanity"})
	public void test6() {
		System.out.println("this is test 6");
	}

}


