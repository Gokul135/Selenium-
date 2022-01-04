package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

		driver.navigate().to("http://www.leafground.com/pages/Calendar.html");
		
		WebElement Calender=driver.findElement(By.id("datepicker"));
		 Calender.sendKeys("01/10/2019"+Keys.ENTER);
		 
		 WebElement Nextbutton=driver.findElement(By.xpath("//a[@title='Next']"));
		
		Nextbutton.click();
		
		WebElement date=driver.findElement(By.xpath(//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[5]/a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
