package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownLeafGrounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("http://leafground.com/pages/Dropdown.html");
		 
		 WebElement findElement = driver.findElement(By.id("dropdown1"));
	     Select drpDwn1 = new Select(findElement);
		 int size = drpDwn1.getOptions().size();
		 drpDwn1.selectByIndex(3);
		 
		 WebElement findElement2 = driver.findElement(By.name("dropdown2"));
	     Select drpDwn2 = new Select(findElement2);
		 int size2 = drpDwn1.getOptions().size();
		 drpDwn2.selectByVisibleText("Appium");
		 
		 WebElement findElement3 = driver.findElement(By.id("dropdown3"));
	     Select drpDwn3 = new Select(findElement3);
		 int size3 = drpDwn1.getOptions().size();
		 drpDwn3.selectByValue("3");
		 
//		 WebElement findElement4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
//	     Select drpDwn4 = new Select(findElement4);
//		 int length = drpDwn3.getOptions().size();
	 
	//	System.out.println("number of options in DropDown"+length);
		 
		 driver.findElement(By.xpath("(//div[@class='example'])[5]/select")).sendKeys(Keys.ARROW_DOWN);
		 
		 WebElement findElement5 = driver.findElement(By.xpath("(//div[@class='example'])[6]/select"));
		 Select drpDwn5 = new Select(findElement5);
		 drpDwn5.selectByIndex(1);
		 drpDwn5.selectByIndex(3);
		 
		 
		 
		 
				 
	     
		 
		 
		 
		 
		 
		
	}

	
	}


