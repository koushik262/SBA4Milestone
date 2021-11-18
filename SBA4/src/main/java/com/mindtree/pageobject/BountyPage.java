package com.mindtree.pageobject;


import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindtree.reusablecomponents.*;
import com.mindtree.uistore.*;

public class BountyPage extends ReadPropertyFile{
	public static Logger log = Logger.getLogger(ReadPropertyFile.class.getName());
	@BeforeTest
	public void initialise() throws IOException {

		driver = DriverInitialisation();
	}
	@Test
	public void BountyPageTest() throws InterruptedException {

		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		log.info("navigation to url");
		BountyUI b=new BountyUI(driver);
		b.getTips().click();
		Thread.sleep(2000);
		if (driver.getPageSource().contains("How To Green Clean Your Home"))
		{
			System.out.println("Text is present");
		}
		else
			System.out.println("Text is not present");
	}
	@AfterTest
	public void close() {

		driver.quit();

	}

}