package com.example;

import org.testng.annotations.Test;

public class NewTest {

@Test(priority = 1)
public void signuptest() {
	System.out.println("user do sign up");
}

@Test(priority = 2)
public void signintest() {
	System.out.println("user do signin");
}
@Test(priority = 3)
public void searchfortickettest() {
	System.out.println("user search for ticket");
}
@Test(priority = 4)
public void bookfortickettest() {
	System.out.println("user book for ticket");
}
@Test(priority = 5)
public void savethetickettest() {
	System.out.println("user save the ticket");
}
@Test(priority = 6)
public void paytheticketetest() {
	System.out.println("user pay for ticket");
}
@Test(priority = 7)
public void logouttest() {
	System.out.println("user logs out");
}

}

