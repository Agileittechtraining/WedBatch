package pommodel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboard {
	WebDriver browser;
	public Dashboard(WebDriver browser) {
		this.browser = browser;
	}
	public void extractdatafrommybookings() {
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
}
