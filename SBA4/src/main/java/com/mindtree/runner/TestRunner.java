package com.mindtree.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\selinium\\COMPREHENSIVE\\SBA4\\src\\main\\java\\Features",
		glue="StepDefinations")
public class TestRunner extends AbstractTestNGCucumberTests{

}
