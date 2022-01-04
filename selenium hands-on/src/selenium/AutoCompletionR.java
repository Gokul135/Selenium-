package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoCompletionR {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
	    System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	  
	    driver.get("http://www.leafground.com/pages/autoComplete.html");
	    
	    WebElement input=driver.findElement(By.id("tags"));
	    input.sendKeys("s");
	    
	    Thread.sleep(3000);
	    
	    List<WebElement> Optionslist=driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
	    
	    for (WebElement webElement : Optionslist) {
	    	
	    webElement.getText().equals("selenium") ;
	    	
	    	webElement.click();
			
	    	break;
	    
		
	    	
	    	
	    	
	
	     	
	    	
	    	
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
