import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Maven-Selenium-june\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		System.out.println("Password is : "+ password);
		
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
	
		//input ID & Password
		driver.findElement(By.id("inputUsername")).sendKeys("Nilesh");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		
		//Verifying login message
		String actual = driver.findElement(By.tagName("p")).getText();
		String expected = "You are successfully logged in." ;
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		
		//Verifying weather user name is there in greetings or not
		actual = driver.findElement(By.tagName("h2")).getText();
		expected = "Hello Nilesh,";
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		
		//LogOut
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
		
		driver.close();
		

	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		
		//Reset Password
		driver.findElement(By.className("reset-pwd-btn")).click();
		
		//Finding recovery message using cssSelector without attribute 
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		String password = passwordText.substring(passwordText.indexOf("'")+1, passwordText.lastIndexOf("'"));
		return password;
		
	}

}














