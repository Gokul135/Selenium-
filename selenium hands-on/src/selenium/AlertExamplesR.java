package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertExamplesR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		
        WebDriver driver=new FirefoxDriver();
        
        driver.get("http://www.leafground.com/pages/Alert.html");
        
        
      WebElement alertbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
      
      alertbox.click();
      
      Alert alert=driver.switchTo().alert();
      
      alert.accept();
      
      WebElement confirmbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
      
      confirmbox.click();
      
      Alert confirm=driver.switchTo().alert();
      
      confirm.dismiss();
      
      WebElement promptbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
      
      promptbox.click();
      
      Alert prompt=driver.switchTo().alert();
      
      prompt.sendKeys("text");
      
      prompt.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
