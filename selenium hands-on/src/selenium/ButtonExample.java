package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonExample {

	public static void main(String[] args) throws  IOException{
		// TODO Auto-generated method stub
		
		WebDriver driver = null;

     FileInputStream stream=new FileInputStream("config.properties");

     Properties properties=new Properties();
     properties.load(stream);
     
    String Browser= properties.getProperty("browser");
    String DriverLocation= properties.getProperty("DriverLocation");
     
     if(Browser.equalsIgnoreCase("Firefox")) {
    	
    	 System.setProperty("webdriver.gecko.driver", DriverLocation);
    	    driver=new FirefoxDriver();
    	  
     }else if(Browser.equalsIgnoreCase("Chrome")) {
    	 System.setProperty("webdriver.chrome.driver", DriverLocation);
 	    driver=new ChromeDriver();
 	  
     
     }
  
    driver.get("http://www.leafground.com/pages/Button.html");
  
  //1.go to home page
  
   WebElement homebutton=driver.findElement(By.id("home"));
   homebutton.click();
   
  //2.get button XYPosition
   
   WebElement getposition=driver.findElement(By.id("position"));
   Point xypoint=getposition.getLocation();
   
   int xValue=xypoint.getX();
   int yValue=xypoint.getY();
   
   System.out.println("x value is :"+xValue+"y value  is :"+yValue);
   
   
   //3.find the button color

   
  WebElement buttoncolor=driver.findElement(By.id("color"));
  
  String color=buttoncolor.getCssValue("background-color");
  
  System.out.println("color is:"+color);
   
  
  //4.find the size of button
   
  
    WebElement buttonsize=driver.findElement(By.id("size"));
    
    int height=buttonsize.getSize().getHeight();
    int width=buttonsize.getSize().getWidth();
    
    
    System.out.println("height is : "+height+"width is:"+width);
    
    
  
  
  
   
	    
	    
	    
	    
	    
	    
	  
	  
	  
       
	   
	   
	   
	 		
		
		
	}

}
