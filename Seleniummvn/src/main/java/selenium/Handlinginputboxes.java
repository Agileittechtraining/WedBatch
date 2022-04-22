package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlinginputboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
ChromeDriver cd = new ChromeDriver();
cd.get("https://www.facebook.com/");
//cd.findElement(By.name("email")).sendKeys("user@facebook.com");
cd.findElement(By.id("email")).sendKeys("123445643");	
cd.findElement(By.name("pass")).sendKeys("S$#der090!");

	}

}
