package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NegativeTests {

	
	/*  Adding block comment because now it will all be tested from positiveTests now called LoginTests
	 * @Parameters({ "username", "password", "expectedMessage" })
	 * 
	 * @Test(priority = 1, groups = { "negativeTests", "smokeTests" }) public void
	 * negativeLoginTest(String username, String password, String expectedMessage) {
	 * //now this method works for both username and password test because we are
	 * using parameters System.out.println("Starting negative login test with " +
	 * username + "and " + password);
	 * 
	 * //create driver System.setProperty("webdriver.chrome.driver",
	 * "src/main/resources/chromedriver"); WebDriver driver = new ChromeDriver();
	 * 
	 * // sleep for 3 seconds before opening the browser window //sleep(3000);
	 * 
	 * //maximize browser window driver.manage().window().maximize();
	 * 
	 * 
	 * // open test page String url = "http://the-internet.herokuapp.com/login";
	 * driver.get(url); System.out.println("Page is open"); sleep(1000);
	 * 
	 * 
	 * // enter username WebElement usernameElement =
	 * driver.findElement(By.id("username")); //you can find by any element you want
	 * like id, name, tag name, xpath, etc. usernameElement.sendKeys(username);
	 * 
	 * // enter password WebElement passwordElement =
	 * driver.findElement(By.name("password")); passwordElement.sendKeys(password);
	 * 
	 * // clock login button WebElement logInButton =
	 * driver.findElement(By.tagName("button")); logInButton.click();
	 * 
	 * sleep(3000);
	 * 
	 * // verification:
	 * 
	 * // successful login message WebElement errorMessage =
	 * driver.findElement(By.id("flash")); String actualErrorMessage =
	 * errorMessage.getText();
	 * 
	 * //Assert.assertEquals(expectedMessage,actualMessage,
	 * "Actual page message is not the same as expected");
	 * Assert.assertTrue(actualErrorMessage.contains(expectedMessage),
	 * "Actual page message is not the same as expected.\nActual Message: " +
	 * actualErrorMessage + "\nExpected Message " + expectedMessage);
	 * 
	 * //Close browser driver.quit();
	 * 
	 * }
	 */
	
	
	
	
	 ///////////By using the Parameter annotation we can use only 1 method to test both tests (configured in NegativeTests.xml)
	/* 
	 * @Test(priority = 2, groups = { "negativeTests" }) public void
	 * incorrectPasswordTest() { System.out.println("Starting negative login test");
	 * 
	 * //create driver System.setProperty("webdriver.chrome.driver",
	 * "src/main/resources/chromedriver"); WebDriver driver = new ChromeDriver();
	 * 
	 * // sleep for 3 seconds before opening the browser window //sleep(3000);
	 * 
	 * //maximize browser window driver.manage().window().maximize();
	 * 
	 * 
	 * // open test page String url = "http://the-internet.herokuapp.com/login";
	 * driver.get(url); System.out.println("Page is open"); sleep(1000);
	 * 
	 * 
	 * // enter username WebElement username =
	 * driver.findElement(By.id("username")); //you can find by any element you want
	 * like id, name, tag name, xpath, etc. username.sendKeys("tomsmith");
	 * 
	 * // enter password WebElement password =
	 * driver.findElement(By.name("password"));
	 * password.sendKeys("IncorrectPaswword");
	 * 
	 * // clock login button WebElement logInButton =
	 * driver.findElement(By.tagName("button")); logInButton.click();
	 * 
	 * sleep(3000);
	 * 
	 * // verification:
	 * 
	 * // successful login message WebElement errorMessage =
	 * driver.findElement(By.id("flash")); String expectedErrorMessage =
	 * "Your password is invalid!"; String actualErrorMessage =
	 * errorMessage.getText();
	 * 
	 * //Assert.assertEquals(expectedMessage,actualMessage,
	 * "Actual page message is not the same as expected");
	 * Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
	 * "Actual page message is not the same as expected.\nActual Message: " +
	 * actualErrorMessage + "\nExpected Message " + expectedErrorMessage);
	 * 
	 * //Close browser driver.quit();
	 * 
	 * 
	 * }
	 */

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
