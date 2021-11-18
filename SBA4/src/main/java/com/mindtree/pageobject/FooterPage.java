package com.mindtree.pageobject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindtree.reusablecomponents.ReadPropertyFile;

public class FooterPage extends ReadPropertyFile {
	public static Logger log = Logger.getLogger(ReadPropertyFile.class.getName());

	@BeforeTest
	public void initialise() throws IOException {

		driver = DriverInitialisation();
	}

	@Test
	public void logintest() throws InterruptedException, IOException {

		driver.get("https://bountytowels.com/en-us");
		Thread.sleep(2000);
		log.info("navigation to url");
		
//		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='lightbox-iframe-f1d0cf56-9412-4745-b7c2-81c9fb252146']")));
//		if(driver.findElement(By.xpath("//*[@id='button3']")).isDisplayed()) {
//		driver.findElement(By.xpath("//*[@id='button3']")).click();
//	}
//		driver.switchTo().defaultContent();
		

		
		driver.findElement(By.xpath("//*[@id='footer-wrapper']/div[2]/div[1]/div[1]/div[1]/div/div[1]/ul/li[4]/a"))
				.click();
		if (driver.getPageSource().contains("Write a review")) {

			System.out.println("Text is present");
		} else {

			System.out.println("Text is absent");
		}
	}
	/*
	 * @AfterTest public void close() {
	 * 
	 * driver.close(); driver = null;
	 * 
	 * }
	 */

}