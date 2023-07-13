import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Maven-Selenium-june\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
//		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
//		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
	
		String style = driver.findElement(By.id("Div1")).getAttribute("style");
		System.out.println(style);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		style = driver.findElement(By.id("Div1")).getAttribute("style");
		System.out.println(style);	
		
		if(style.contains("1")) {
			System.out.println("It's Enabled");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("It's Disabled");
			Assert.assertTrue(false);
		}
		
		driver.close();
	
	}

}
