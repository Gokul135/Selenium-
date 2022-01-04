package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Buttoexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		   WebDriver driver=new FirefoxDriver();
		  
		   driver.get("http://www.leafground.com/pages/Button.html");
	
		  
		   WebElement homebutton=driver.findElement(By.id("home"));
		   homebutton.click();
		   
		 
		   
		   WebElement getposition=driver.findElement(By.id("position"));
		   Point xypoint=getposition.getLocation();
		   
		   int xValue=xypoint.getX();
		   int yValue=xypoint.getY();
		   
		   System.out.println("x value is :"+xValue+"y value  is :"+yValue);
		   
		   

		   
		  WebElement buttoncolor=driver.findElement(By.id("color"));
		  
		  String color=buttoncolor.getCssValue("background-color");
		  
		  System.out.println("color is:"+color);
		   
		  

		   
		  
		    WebElement buttonsize=driver.findElement(By.id("size"));
		    
		    int height=buttonsize.getSize().getHeight();
		    int width=buttonsize.getSize().getWidth();
		    
		    
		    System.out.println("height is : "+height+"width is:"+width);
		    
		    
		  
	}

}
