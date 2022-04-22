package pommodel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class Runner {
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
		Login Loginpage = new Login(browser);
		Loginpage.enterusernameandpassword("user@phptravels.com", "demouser");
	    Assert.assertEquals(browser.getTitle(), expected);
	}
	@Test(priority = 3)
	public void mybookings() {
		Dashboard dashboardpage = new Dashboard(browser);
		dashboardpage.extractdatafrommybookings();
	}
	@Test(priority = 4)
	public void logout() {
		String Expected = "Login - PHPTRAVELS"; 
		Logout logoutpage = new Logout(browser);
		logoutpage.logout();
	    Assert.assertEquals(browser.getTitle(),Expected);
	}
	@AfterTest
	public void closebrowser() {
		browser.quit();
	}
	}


