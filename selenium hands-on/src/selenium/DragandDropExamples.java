package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
	
	WebElement From=driver.findElement(By.id("draggable"));
	WebElement To=driver.findElement(By.id("droppable"));
		
		Actions actions=new Actions(driver);
		
		actions.dragAndDrop(From, To).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
