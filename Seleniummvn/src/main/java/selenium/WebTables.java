package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Installations\\geckodriver.exe");
		FirefoxDriver cd = new FirefoxDriver();
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cd.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		String search = "GSFC";
		List<WebElement> companynames = cd.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> currentprice = cd.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println(companynames.size());
	    for(int i=0;i<=companynames.size();i++) {
	    	if(companynames.get(i).getText().equals(search)) {
	    	System.out.print(companynames.get(i).getText() + "----->");
	        System.out.println(currentprice.get(i).getText());
	        break;
	    }
	}
	}
}
