package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Editbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
	   driver.get("http://www.leafground.com/pages/Edit.html");
	   
	   
	   
	   WebElement emailbox=driver.findElement(By.id("email"));
	   emailbox.sendKeys("test@gmail.com");
	   
	   WebElement addtext=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
	   addtext.sendKeys("text");
	   
	   WebElement Atribute=driver.findElement(By.name("username"));
	   String value=Atribute.getAttribute("value");
	   System.out.println("value");
	   
	   
	   
	   WebElement erase= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/input"));
	   erase.clear();
	   
	   WebElement disablebox=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
	  boolean enabled= disablebox.isEnabled();
	   
	  System.out.println(enabled);
	   
	   
	   
	}

}
