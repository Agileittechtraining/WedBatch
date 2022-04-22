package selenium;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Openurl {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 ChromeOptions c = new ChromeOptions();
	        //FirefoxOptions f = new FirefoxOptions();
			//ChromeDriver cd = new ChromeDriver();
	        RemoteWebDriver r = new RemoteWebDriver(new URL("http://localhost:4444/"),c);
			r.get("https://www.facebook.com/");
			//cd.findElement(By.name("email")).sendKeys("use@facebook.com");
			r.findElement(By.id("email")).sendKeys("user@facrbook.com");
			r.quit();

	}

}
