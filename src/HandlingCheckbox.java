import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Maven-Selenium-june\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Check friends and family
		WebElement e = driver.findElement(By.cssSelector("input[id*='friendsandfamily']"));
		System.out.println(e.isSelected());
		e.click();
		System.out.println(e.isSelected());
		
		
		//Lets check count of checkboxes
		int count = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println(count);
		
		driver.close();

	}

}
