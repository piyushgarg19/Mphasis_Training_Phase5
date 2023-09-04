package com.example;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class NewTest {
WebDriver wd=null;
	
	@BeforeTest
	public void init() {
		  // register chrome driver 
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
    //create an object to the driver to access the browser componenets 
    	wd=new ChromeDriver();
    	//maximize the browser 
    	wd.manage().window().maximize();
    	//to open web url -> localhost , www.
	}

  @Test(dataProvider = "dp")
  public void f(String url) {
  wd.get(url);
  Reporter.log("went to test1 and url is opened ");
  }
  
  @AfterTest
	public void close() {
		wd.close();
	}


  @DataProvider
  public Object[][] dp() {
	    return new Object[][] {
	    	//test1
	      new Object[] {"https://www.google.com/"},
	    //test2
	      new Object[] { "https://www.amazon.in/" },
	    };
	  }
	}

