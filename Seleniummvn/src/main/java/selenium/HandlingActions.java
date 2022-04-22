package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Installations\\geckodriver.exe");
		FirefoxDriver cd = new FirefoxDriver();
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cd.get("https://www.snapdeal.com/");
		WebElement electronics = cd.findElement(By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[9]/a/span"));
		//WebDriverWait wd = new WebDriverWait(cd,Duration.ofSeconds(30));
		//wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("pusDenied")));
		cd.findElement(By.id("pushDenied")).click();
		//Thread.
		Actions A = new Actions(cd);
		A.moveToElement(electronics).build().perform();
		WebElement largeappliances = cd.findElement(By.xpath("//*[@id=\"category8Data\"]/div[2]/div/div"));
		A.moveToElement(largeappliances).click().build().perform();
	    WebElement leftslider = cd.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[1]/div/div[1]/div[2]/div[2]/div[3]/div/div[1]/a[1]"));
	    A.dragAndDropBy(leftslider, 20, 0).build().perform();
	}

}
