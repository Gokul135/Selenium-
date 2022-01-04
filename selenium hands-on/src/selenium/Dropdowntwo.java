package selenium;

import java.util.List;

import org.checkerframework.common.reflection.qual.NewInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowntwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub



		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

		driver.get("http://www.leafground.com/pages/Dropdown.html");


		WebElement dropdowntwo=driver.findElement(By.id("dropdown1"));
		Select select=new Select(dropdowntwo);

		select.selectByIndex(1);

		select.selectByValue("2");

		select.selectByVisibleText("UFT/QTP");

		List<WebElement> listofoptions= select.getOptions();

		int list=listofoptions.size();

		System.out.println("list of option is :"+list);
		
		dropdowntwo.sendKeys("Loadrunner");
		
		
        WebElement multiSelect=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
        
        Select multiselectbox= new Select(multiSelect);
        
        multiselectbox.selectByIndex(1);
        multiselectbox.selectByIndex(2);
       
        
        
   
      
        
        
        


















	}

}
