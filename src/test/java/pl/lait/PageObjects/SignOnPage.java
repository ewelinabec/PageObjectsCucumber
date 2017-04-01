package pl.lait.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * 
 * @author KJ1
 *komentarz do strony Sign On
 */
public class SignOnPage {
	
	
	static String userNameText = "userName";
	static String passwordText = "password";
	static String loginButtonText = "login";
	
	public void loginAs(String user, String pass, WebDriver driver) {
	
			driver.findElement(By.name(userNameText)).sendKeys(user);
			driver.findElement(By.name(passwordText)).sendKeys(pass);
			driver.findElement(By.name(loginButtonText)).click();
			
	}
	
	public boolean isElementPresent(By locatorKey, WebDriver driver) {
		try {
			driver.findElement(locatorKey);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	

}

/*
 * a to drugi komentarz do Sign On
 */
