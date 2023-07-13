import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Invoking Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Maven-Selenium-june\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("name")).sendKeys("Nilesh Modi");
		driver.findElement(By.id("alertbtn")).click();
		
		//Alert will be on screen 
		//Validating Alert
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); //for any positive (yes, accept, ok etc) we use accept();
		
		
		//Clicking on confirm button
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss(); //for any Negative (No, cancel etc) we use accept();
		
		
		
		
		driver.close();
		
		

	}

}
