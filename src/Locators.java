import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Invoking Browser
		//Chromedriver.exe -> Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Maven-Selenium-june\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//input ID & Password
		driver.findElement(By.id("inputUsername")).sendKeys("Nilesh");
		driver.findElement(By.name("inputPassword")).sendKeys("123123");
		driver.findElement(By.className("signInBtn")).click();
		
		//Printing the error code
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//Forgot password
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		
		//Using customized Xpath & CSS Selectors
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Nilesh");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Nilesh@rs.com");
		
		
		//Using index for Xpath
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
		//Using index for cssSelector
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("Nilesh@gmail.com");
		
		//Xpath without attribute
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("98724442525");
		
		//Reset Password
		driver.findElement(By.className("reset-pwd-btn")).click();
		
		//Finding recovery message using cssSelector without attribute 
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.className("go-to-login-btn")).click();
		Thread.sleep(2000); //given time to overcome ElementClickInterceptedException
		
		//Login again
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Nilesh");
		//Password element find using regular cssSelector expression
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		//submit button element find using regular xpath expression
		driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();
		
		
		
		
		
		
//		driver.quit();

	}

}
