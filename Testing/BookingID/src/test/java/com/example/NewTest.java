package com.example;

import org.testng.annotations.Test;

public class NewTest {
String bookId=null;
@Test(priority = 1)
public void booking() {
	int a=60/0;
	bookId="XYZ";
}

@Test(priority = 2,dependsOnMethods = {"booking"})
public void tracking() {
	if(bookId!=null) {
	System.out.println("shipiing in progress");
	}
	else {
		System.out.println("booking failed cannot be shipped");
	}
}


@Test(priority = 3,dependsOnMethods = {"booking"})
public void cancel() {
	if(bookId!=null) {
	System.out.println("canacellation in progress");
	}
	else {
		System.out.println("cancellation failed ..");
	}
}
}

