package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlingpopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Installations\\geckodriver.exe");
		FirefoxDriver cd = new FirefoxDriver();
		cd.manage().window().maximize();
		cd.get("https://echoecho.com/javascript4.htm");
		cd.findElement(By.name("B3")).click();
		String s = cd.switchTo().alert().getText();
		System.out.println(s);
		cd.switchTo().alert().sendKeys("hi");
		cd.switchTo().alert().accept();
		
	}

}
