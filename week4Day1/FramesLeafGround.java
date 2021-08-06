package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesLeafGround {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("http://leafground.com/pages/frame.html");
		 driver.manage().window().maximize();
		
		   WebElement frame01 =driver.findElement(By.id("wrapframe"));
		   driver.switchTo().frame(frame01);
		   
		   driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		   driver.switchTo().defaultContent();
		   
		   
		   
	}

}
