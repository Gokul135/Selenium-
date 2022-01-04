package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImageExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	  
	    driver.get("http://www.leafground.com/pages/Image.html");
	    
	    WebElement Firstimage=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));

		Firstimage.click();
		
		WebElement Imagebutton=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[4]/a/img"));
		
		Imagebutton.click();
		
		WebElement Brokenimage=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		
		
		if (Brokenimage.getAttribute("naturalWidth").equals("0")){
			
			System.out.println("Image is broken");
		}else {
			
			System.out.println("Image is not broken");
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
