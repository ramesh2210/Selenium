package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlerts {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/Alert.html");
		 
        driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
        
        Alert alert = driver.switchTo().alert();
        
        alert.accept();
        
        driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
        
        alert.accept();
        String str= driver.findElement(By.xpath("//p[@id='result']")).getText();
        System.out.println(str);
        
        driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
        
        alert.sendKeys("LeafGround");
        alert.accept();
        
        driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
        alert.accept();
        
        driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
        
        driver.findElement(By.xpath("//button[text()='OK']")).click();
        
        driver.quit();
        
        
         

	}

}
