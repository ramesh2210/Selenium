package week2.day2;


//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("http://www.leafground.com/pages/Dropdown.html");		 
		 driver.manage().window().maximize();
		 
		 WebElement findElement = driver.findElement(By.id("dropdown1"));
	     Select drpDwn1 = new Select(findElement);
		 int size = drpDwn1.getOptions().size();
		 drpDwn1.selectByIndex(3);
		 
		 WebElement findElement1 = driver.findElement(By.id("dropdown2"));
	     Select drpDwn2 = new Select(findElement);
	     drpDwn2.selectByValue("LoadRunner");
	     
	     	     
	     
      
	}

}
