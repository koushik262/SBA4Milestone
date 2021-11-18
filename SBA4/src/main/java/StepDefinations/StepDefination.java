package StepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;


import com.mindtree.reusablecomponents.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination extends ReadPropertyFile{

    @Given("^Initialize browser with chrome$")
    public void initialize_browser_with_chrome() throws Throwable {
    	driver = DriverInitialisation();
    	
    }
    @Given("Navigate to {string} site")
    public void navigate_to_site(String string) {
    	driver.get(string);
    }

    @Then("^click on Search and enter \"([^\"]*)\"$")
    public void click_on_search_and_enter_something(String strArg1) throws Throwable {
    	driver.findElement(By.xpath("//*[@id='nav']/div[2]/ul/li[7]/a/img")).click();
    	driver.findElement(By.xpath("//*[@id='search-box-input']")).sendKeys(strArg1);
    	driver.findElement(By.xpath("//*[@id='search-box-input']")).click();
    }


    @And("^check weather thepagecontains \"([^\"]*)\"$")
    public void check_weather_thepagecontains_something(String strArg1) throws Throwable {
    	if (driver.getPageSource().contains(strArg1)) {

			System.out.println("Text is present");
		} else {

			System.out.println("Text is absent");
		}
    }

    @And("^Close the driver$")
    public void close_the_driver() throws Throwable {
        driver.close();
    }

}