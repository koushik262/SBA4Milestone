package com.mindtree.uistore;


import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.reusablecomponents.ReadPropertyFile;


public class BountyUI extends ReadPropertyFile{

		WebDriver driver;
		By tips=By.xpath("//*[@id=\"nav\"]/div[2]/ul/li[4]/a/div/h3");
		public BountyUI(WebDriver driver)
		{
			this.driver=driver;
		}
		public WebElement getTips()
		{
			return driver.findElement(tips);
		}
		
	}

