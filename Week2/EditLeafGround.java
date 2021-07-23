package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;


public class EditLeafGround {

	

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("http://leafground.com/pages/Edit.html");
		 
		 //Thread.sleep(300);
		 
		 driver.findElement(By.id("email")).sendKeys("testmail@gmail.com");
		 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("append",Keys.TAB);
		 String str = driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");
		 
		 System.out.println(str);
		 
		 driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		  
		 Boolean check = driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled();
		 
		 System.out.println(check);
		 
		 
		
		 
		 
		 
		 
	}

}
