package bddframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	String BrowserName = "Chrome";
	WebDriver browser;
@Before
public void precondition() {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "C:\\Selenium Installations\\geckodriver.exe");
	System.setProperty("webdriver.edge.driver", "C:\\Selenium Installations\\msedgedriver.exe");
    if(BrowserName.equals("Firefox")) {
    	browser = new FirefoxDriver();
    	}else if(BrowserName.equals("Chrome")) {
    	browser = new ChromeDriver();
    	}else if(BrowserName.equals("Edge")) {
    	browser = new EdgeDriver();
    	 }else {
    		 System.out.println("Please select only valid browsers");
    	 }
}

@Given("To open URL of the application")
public void openurl() {
	browser.get("https://www.phptravels.net/login");
	browser.manage().window().maximize();
}
@And("Url is successfully openend")
public void verifyurl() {
	String Expected = "Login - PHPTRAVELS"; 
	Assert.assertEquals(browser.getTitle(),Expected);
}
@When("I enter username")
public void enterusername() {
	browser.findElement(By.name("email")).sendKeys("user@phptravels.com");
}
@And("I enter password")
public void enterpassword() {
	browser.findElement(By.name("password")).sendKeys("demouser");
}
@And("I click on the login button")
public void clicklogin() {
	browser.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();
}
@Then("I validate login page is succefully openened")
public void verifylogin() {
	String expected = "Dashboard - PHPTRAVELS";
	Assert.assertEquals(browser.getTitle(), expected);
}
@After
public void closebrowser() {
	browser.close();
}
}
