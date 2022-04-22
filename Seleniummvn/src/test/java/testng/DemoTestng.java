package testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoTestng {
@Test(priority = 1)
public void demotestcase() {
	System.out.println("This is my first testcase");
	Assert.assertEquals("Actual", "Expected");
}
@Test(priority = 2 , dependsOnMethods = "demotestcase" )
public void demotestcase2() {
	System.out.println("This is my second test case");
	SoftAssert sa = new SoftAssert();
	sa.assertEquals("Actual", "Expected");
	sa.assertAll();
}
@BeforeTest
public void precondition() {
	System.out.println("This is my precondition");
}
@AfterTest
public void postcondition() {
	System.out.println("This is my postcondition");
}
@BeforeSuite
public void preprecondition() {
	System.out.println("This is my preprecondition");
}
@AfterSuite
public void postpostcondition() {
	System.out.println("This is my post post condition");
}
@BeforeClass
public void beforeclass() {
	System.out.println("This is from Beforeclass");
}
@AfterClass
public void afterclass() {
	System.out.println("This is from Afterclass");
}
@BeforeMethod
public void before() {
	System.out.println("This is from beforemethod");
}
@AfterMethod
public void after() {
	System.out.println("This is from aftermethod");
}
}
