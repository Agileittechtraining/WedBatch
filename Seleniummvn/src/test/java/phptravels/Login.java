package phptravels;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	String BrowserName = "Chrome";
	WebDriver browser;
@Test(priority = 1)
public void openurl() {
	String Expected = "Login - PHPTRAVELS"; 
	browser.manage().window().maximize();
	browser.get("https://www.phptravels.net/login");
	Assert.assertEquals(browser.getTitle(),Expected);
}
@BeforeTest
public void preconditions() {
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
@Test(priority = 2)
public void enterusernameandpassword() {
	String expected = "Dashboard - PHPTRAVELS";
	browser.findElement(By.name("email")).sendKeys("user@phptravels.com");
	browser.findElement(By.name("password")).sendKeys("demouser");
	browser.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();
    Assert.assertEquals(browser.getTitle(), expected);
}
@Test(priority = 3)
public void mybookings() {
	browser.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[2]/a")).click();
    WebDriverWait wd = new WebDriverWait(browser,Duration.ofSeconds(30));
	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/div/table/tbody/tr[33]/td[4]/div/a")));
    List<WebElement> Type = browser.findElements(By.xpath("//table[@class='table  text-center']/tbody/tr/th[1]"));
    List<WebElement> Status = browser.findElements(By.xpath("//table[@class='table  text-center']/tbody/tr/td[3]"));
    for(int i=0;i<Type.size();i++) {
    	System.out.print(Type.get(i).getText()+"---->");
    	System.out.println(Status.get(i).getText());
    }
}
@Test(priority = 4)
public void logout() {
	String Expected = "Login - PHPTRAVELS"; 
	browser.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[5]/a")).click();
    Assert.assertEquals(browser.getTitle(),Expected);
}
@AfterTest
public void closebrowser() {
	browser.quit();
}
}
