package pommodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Logout {
	WebDriver browser;
	public Logout(WebDriver browser) {
    this.browser = browser;		
	}
	public void logout() {
		 
		browser.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[5]/a")).click();
	    
	}
}
