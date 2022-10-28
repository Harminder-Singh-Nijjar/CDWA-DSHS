package Selenium.maven.Selenium.maven.demo;

import java.io.*;
import java.lang.Thread;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.Frame;  // Using Frame class in package java.awt


public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	String emailAddress = "EmailAddress";
    	String password = "Password";
    	String url = "https://cdmsportal.b2clogin.com/cdmsportal.onmicrosoft.com/b2c_1_r_v4prod_signin/oauth2/v2.0/authorize?client_id=ccfbd7cc-68e2-4ed7-bc54-fa84dff77672&scope=openid%20ccfbd7cc-68e2-4ed7-bc54-fa84dff77672%20profile%20offline_access&redirect_uri=https%3A%2F%2Fdirectmycare.com%2F&client-request-id=5d0cb358-b926-4d4a-9b51-87518f47b191&response_mode=fragment&response_type=code&x-client-SKU=msal.js.browser&x-client-VER=2.17.0&x-client-OS=&x-client-CPU=&client_info=1&code_challenge=_JJ1vidbIMQCdqFzSxRFeEaOXaOzjU2-pEb-LjqoYqg&code_challenge_method=S256&nonce=eb4c4bec-d7c7-45c5-854d-805b8721a0bb&state=eyJpZCI6ImYwMjBmZjY2LTM2ODgtNGFmMi1iNDk5LWMzZGU2ZmU1NzFkYiIsIm1ldGEiOnsiaW50ZXJhY3Rpb25UeXBlIjoicmVkaXJlY3QifX0%3D&ui_locales=ui_locales=en";
    	// Open the CDWA login page. 
    	driver.get(url);
    	// Sleep for 1 second. 
    	try {
    	    Thread.sleep(1000);                 //1000 milliseconds is one second.
    	} catch(InterruptedException ex) {
    	    Thread.currentThread().interrupt();
    	}
    	// Type in the email address.
    	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailAddress);
    	
    	// Type in the password.
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    	
    	// Sleep for 1 second.
    	try {
    	    Thread.sleep(1000);                 //1000 milliseconds is one second.
    	} catch(InterruptedException ex) {
    	    Thread.currentThread().interrupt();
    	}
    	
    	// Click the sign in button on the login page. 
    	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div/div/div[2]/form/div[3]/div[4]/button")).click();
    	
    	// Sleep for 1 second.
    	try {
    	    Thread.sleep(1000);                 //1000 milliseconds is one second.
    	} catch(InterruptedException ex) {
    	    Thread.currentThread().interrupt();
    	}
    	
    	// Click the sign in button on the Direct My Care page.
    	driver.findElement(By.xpath("/html/body/app-root/main/app-login/main/section/div/div/div[2]/div[2]/div/div[2]/div/a[1]")).click();
    	
    	
    	// Sleep for 5 seconds.
    	try {
    	    Thread.sleep(5000);                 //5000 milliseconds is five second.
    	} catch(InterruptedException ex) {
    	    Thread.currentThread().interrupt();
    	}
    	
    	// Click the Time/Mileage Entry button on My Dashboard.
    	driver.findElement(By.xpath("/html/body/app-root/main/app-participant/app-cargiverdashboard/section/div[1]/span/button[4]")).click();
    	
    	
    	} 
    
    	
    
    
}

