package com.careerhack.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.careerhack.common.GoogleBase;
import com.careerhack.pages.PageObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch extends GoogleBase{
	
	//po= create object
	//two ways to call from another class: inherit, creating object 
	
	@Given("I am on google hoempage")
	public void i_am_on_google_hoempage() {
		
		launchBrowser();
		
	}

	@When("I enter a search {string}")
	public void i_enter_a_search(String string) {
	    //step 1: identify the web element and give the element a name
		//8 locators: id, name, tag, class name, link text, partial link text, xpath, css-selector
		
		PageObjects po = new PageObjects(driver);
		po.enterSearch(string);
		
	}

	@When("I click on search button")
	public void i_click_on_search_button() {
		PageObjects po = new PageObjects(driver);
		po.clickSearch();
		
	}

	@Then("I see the number of results returned")
	public void i_see_the_number_of_results_returned() {
		
		//WebElement resultStats;
		
		//resultStats = driver.findElement(By.id("result-stats"));
		
		//String results = resultStats.getText();
		
		//System.out.println("================================================");
		//System.out.println(results);
		//System.out.println("================================================");
		
		//driver.close();
		PageObjects po = new PageObjects(driver);
		po.results();
		
	    po.close();
	}
	
	

}
