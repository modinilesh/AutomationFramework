import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Task : increase the adult count to 5 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Maven-Selenium-june\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		//Before increasing adult values
		System.out.println("Before : "+ driver.findElement(By.id("divpaxinfo")).getText());
		
		int i = 1;
		while(i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		
		//Clicking on done
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//After increasing
		System.out.println("After : "+ driver.findElement(By.id("divpaxinfo")).getText());
		
		
		driver.close();

	}

}
