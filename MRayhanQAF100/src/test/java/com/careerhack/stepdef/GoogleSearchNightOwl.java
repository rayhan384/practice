package com.careerhack.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchNightOwl {
	
	WebDriver driver;

	@Given("I am on google homepage")
	public void i_am_on_google_homepage() {
		
		WebDriverManager.safaridriver().setup();
		driver = new SafariDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	    
	}

	@When("i enter a search {string} on the search box")
	public void i_enter_a_search_on_the_search_box(String string) {
		
		WebElement searchBox = driver.findElement(By.name("q")); //Object Created and identify element by nane
        searchBox.sendKeys(string);  //Method called by obj(searchBox)
         
	}

	@When("I click on the results and count of the results")
	public void i_click_on_the_results_and_count_of_the_results() {
		
		WebElement searchButton = driver.findElement(By.name("btnk"));//another object created
		searchButton.submit();//method called by obj(searchButton)
		
	    	}

	@Then("I find relevent results and count of the results")
	public void i_find_relevent_results_and_count_of_the_results() {
		
		WebElement results = driver.findElement(By.id("result-stats"));
		//String resultCounts = results.getText();
	   // System.out.println("==========================================");
	        // System.out.println("resultCounts");
	        // driver.close();
	}

	
	
	
	
	
	
	
	
}
