package week3.day2;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioBagBrands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.ajio.com/women-bags-belts-wallets/c/830301");
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(6000);
		 
		
		 List<WebElement> brands = driver.findElementsByXPath("//div[@class='brand']");
		
		 int size = brands.size();
		 
		 for  (WebElement webElement : brands) {
			 
			 String brandNames =  webElement.getText(); 
			System.out.println(brandNames);
		}
		 
		 
		

	}

}
