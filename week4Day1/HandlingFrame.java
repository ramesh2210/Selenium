package week4.day1;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//ClassRoom for Alerts and Frames:
//--------------------------------
//https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm
//Click Try It Button
//Click OK/Cancel in the alert
//Confirm the action is performed correctly by verifying the text !!
// Hint
//Switch to the frame
//Then click Try It with xpath
//Switch to the alert
//Then perform accept / dismiss
//Get the text using id 
//Verify the text based on the actionpackage week4.day1;

public class HandlingFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement find1 = driver.findElement(By.xpath("//div[@id='iframewrapper']/iframe"));
		driver.switchTo().frame(find1);
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		
		
		
		
	}

}
