package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowExamplesR2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		Thread.sleep(3000);

		String Parentwindow=driver.getWindowHandle();

		WebElement home=driver.findElement(By.id("home"));
		
		Thread.sleep(3000); 
		
		home.click();

		Set<String> Handles= driver.getWindowHandles();

		for (String Newwindows : Handles) {

		driver.switchTo().window(Newwindows);	}
		
		Thread.sleep(3000);
		
        WebElement Editbox=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
        Editbox.click();
       
        driver.close();
        driver.switchTo().window(Parentwindow);
        
		WebElement Multiplewindow=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		Multiplewindow.click();

		int NumofWindows=driver.getWindowHandles().size();

		System.out.println("Windows:"+NumofWindows);
		
		Thread.sleep(3000);

       WebElement Dontclose=driver.findElement(By.id("color"));
       
       Thread.sleep(3000);
       
       Dontclose.click();
       
       Set<String> Childindows=driver.getWindowHandles();
       
       for (String  Allwindow : Childindows) {
		
    	   if (!Allwindow.equals(Parentwindow));
    	   
    	  driver.switchTo().window(Allwindow);
    	  
    	   driver.close();
    	   
    	  driver.quit();
    	   
    	   {
			
		}
    	   
	}


	}

}
