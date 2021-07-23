package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.fetch.Fetch.GetResponseBodyResponse;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksLeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("http://leafground.com/pages/Link.html");		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.partialLinkText("Home")).click();
		 String title = driver.getCurrentUrl();
		 System.out.println(title);
		 
		 driver.findElement(By.linkText("HyperLink")).click();
		 
		 String title1 = driver.getCurrentUrl();
		 System.out.println(title1);
		 
		 driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
		 String pageTitle = driver.getTitle();
		 
		 if(pageTitle.contains("HTTP Status 404 – Not Found"))
			 
		 {
			 System.out.println("Link is Broken");
		 }
		 
		 driver.get("http://leafground.com/pages/Link.html");
		 
//		 Boolean value1 = true;
//		 
//		 
//		 while (value1.isequals ) {
//			 
//			 Boolean value1 = driver.findElement(By.tagName("a")).isDisplayed();
//		 }
//			
//			 
//		}
			
		//driver.findElement(By.tagName("a"));
		 
		 
		 
		 
		 
	}

}
