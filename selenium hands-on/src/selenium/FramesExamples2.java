package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesExamples2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		
	    WebElement Clickme=driver.findElement(By.id("Click"));
        Clickme.click();
       
       
      String gettext= driver.findElement(By.id("Click")).getText();
      
     System.out.println(gettext);
		
    driver.switchTo().defaultContent();
    
    driver.switchTo().frame(1);
    driver.switchTo().frame("frame2");
    
   WebElement Nestbutton= driver.findElement(By.id("Click1"));
  
   Nestbutton.click();
  
     driver.switchTo().defaultContent();
     
     List<WebElement>  Numofframes= driver.findElements(By.tagName("iframe"));
     
    int totalframes= Numofframes.size();
     
     System.out.println(totalframes);
     
    
    
    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
