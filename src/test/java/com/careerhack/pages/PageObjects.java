package com.careerhack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
	
	//constructor initializes an object
	//constructor has the same name as the class
	
	WebDriver driver;
	
	
	public PageObjects (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	//WebElement searchBox;
	
	//searchBox = driver.findElement(By.name("q"));
	@FindBy(name="q")
	WebElement searchBox;
			
	//step 2: perform action
	//searchBox.sendKeys(string);
	
	public void enterSearch(String string) {
		searchBox.sendKeys(string);
		
		
		
	}
	
	
	//WebElement searchBtn;
	
	//searchBtn = driver.findElement(By.name("btnK"));
    @FindBy(name="btnK")
    WebElement searchBtn;
    
	//searchBtn.click();
	//searchBtn.submit();
    
    public void clickSearch() {
    	searchBtn.submit();	
    	
    }
    
    //WebElement resultStats;
	
	//resultStats = driver.findElement(By.id("result-stats"));
    @FindBy(id="result-stats")
    WebElement resultStats;
	
	//String results = resultStats.getText();
	public void results() {
		System.out.println("================================================");
		System.out.println(resultStats);
		System.out.println("================================================");
	}
	//System.out.println("================================================");
	//System.out.println(results);
	//System.out.println("================================================");
	public void close() {
		driver.close();
	}
	
	
}
