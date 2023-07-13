import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartMultipleProducts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		//Invoking Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Maven-Selenium-june\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		//Expected products
		String exp[] = {"Cucumber", "Brocolli"};
		
		//Finding products
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		Thread.sleep(2000);
		
		//Let's add to cart
		//Method 1
		int ct = 0;
		//Below loop will iterate through all products webelements
		for(int i=0; i < products.size(); i++) {
			WebElement e = products.get(i);
			
			//For each loop will check for each values which are expected each time
			for(String s : exp) {
				
				//if element expected product found then find and click on add to cart
				if(e.getText().contains(s)) {
					
					//Text based Xpaths are not suggested to use as these are dynamically change most of the time
//					driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
//					Thread.sleep(5000);
					
					//So simply use tagname based which are fixed xpaths
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					ct++;
					break;
				}
			}
			
			if(ct == exp.length) break; //if all expected products are added to cart
			
		}
		
		
		
		Thread.sleep(5000);
		//Method 2
		ct = 0;
		for(int i=0; i<products.size(); i++) {
			
			WebElement e = products.get(i);
			//Let's get formatted product name form text of this webelement
			String str = e.getText();
			String formated[] = str.split("-");
			String formatedProductName = formated[0].trim();
			
			
					
			//Let's convert the expected array to arrayList
			List ll = Arrays.asList(exp);
			
			//Let's simply check
			if(ll.contains(formatedProductName)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				ct++;
				if(ct == exp.length) break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
