import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Invoking Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Maven-Selenium-june\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		//From ----> To
		//Lets check FROM : Bangalore TO: Chennai
		//Clicking on First Dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//click on Bangalore
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		
		//Check for Arrival city
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		//Chennai
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); //As there is already a Chennai present in first dropdown so given index 2
		//same as above with Parent Child Relationship
		//parent : //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']
		//child : //a[@value='MAA']
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		
		//Selecting date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		
		//Selecting passenger
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i = 1;
		while(i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		//Clicking on done
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
		//Selecting a Checkbox
		WebElement e = driver.findElement(By.cssSelector("input[id*='friendsandfamily']"));
//		System.out.println(e.isSelected());
		e.click();
//		System.out.println(e.isSelected());
		
		
		
		//Checking return date is disabled
		String style = driver.findElement(By.id("Div1")).getAttribute("style");
//		System.out.println(style);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		style = driver.findElement(By.id("Div1")).getAttribute("style");
//		System.out.println(style);	
		
		if(style.contains("1")) {
			System.out.println("It's Enabled");
			Assert.assertTrue(false);
		}
		else {
			System.out.println("It's Disabled");
			Assert.assertTrue(true);
		}
		
		
		//Click on search
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
