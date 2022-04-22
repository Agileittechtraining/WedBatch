package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatingdynamicelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://register.rediff.com/register/register.php?FormName=user_details");
		//cd.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Hello Hi");
		cd.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input")).sendKeys("Hello How are you");
	    //cd.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[3]/input")).sendKeys("Hi How are you");
	    cd.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(10) > td:nth-child(3) > input[type=password]")).sendKeys("Hi How are you");
	}

}
