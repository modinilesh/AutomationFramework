import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Maven-Selenium-june\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Lets check FROM : Bangalore TO: Chennai
		//Clicking on First Dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//click on Bangalore
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
				
		//Check for Arrival city
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		//Chennai
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); //As there is already a Chennai present in first dropdown so given index 2
		//same as above with Parent Child Relationship
		//parent : //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']
		//child : //a[@value='MAA']
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		//Lets check todays date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		
		driver.close();

		

	}

}
