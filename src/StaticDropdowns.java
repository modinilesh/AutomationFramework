import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//select tag name represents Static Dropdown
		
		System.setProperty("webdriver.chrome.driver", "C:\\Maven-Selenium-june\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement selectDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		//Creating Select object
		Select drpdn = new Select(selectDropdown);
		drpdn.selectByIndex(3);
		String text = drpdn.getFirstSelectedOption().getText();
		System.out.println(text);
		
		drpdn.selectByVisibleText("AED");
		text = drpdn.getFirstSelectedOption().getText();
		System.out.println(text);
		
		drpdn.selectByValue("INR"); //value = attribute's value
		text = drpdn.getFirstSelectedOption().getText();
		System.out.println(text);
		
		driver.close();

	}

}
