package com.mindtree.pageobject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindtree.reusablecomponents.ReadPropertyFile;

public class SearchBar extends ReadPropertyFile{
	public static Logger log=Logger.getLogger(ReadPropertyFile.class.getName());
	
	@BeforeTest
	public void initialise() throws IOException {
		
		driver=DriverInitialisation();
	}
	
	@Test
	public void logintest() throws InterruptedException {
		
		
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		log.info("navigation to url");	
		
		
		
		if(driver.getPageSource().contains("Text to check")){

			System.out.println("Text is present");

			}else{

			System.out.println("Text is absent");
			}
		
	}
	
	@AfterTest
	public void close() {
		
		driver.close();
		driver=null;
		
	}

}
