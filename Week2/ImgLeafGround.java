package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.This;

public class ImgLeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/Image.html");
		
		driver.findElement(By.xpath("//label[@for='home']/following-sibling::img")).click();
		
		driver.findElement(By.xpath("//img[@alt='Images']")).click();
		
		String currPage = driver.getCurrentUrl();
		driver.findElement(By.xpath("//label[@for='position']/following-sibling::img")).click();
		String currPage1 = driver.getCurrentUrl();
		
		
		if (currPage.equals(currPage1))
			
		System.out.println("Image is Broken");
				
		driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img")).sendKeys(Keys.ENTER);	

	}

}
