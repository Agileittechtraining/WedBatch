package pommodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver browser;
	public Login(WebDriver browser) {
		this.browser = browser;
	}
	public void enterusernameandpassword(String username, String password) {
		browser.findElement(By.name("email")).sendKeys(username);
		browser.findElement(By.name("password")).sendKeys(password);
		browser.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();
	    
	}
}
