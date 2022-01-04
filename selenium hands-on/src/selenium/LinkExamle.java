package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkExamle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
	    driver.get("http://www.leafground.com/pages/Link.html");
		
	    driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/a")).click();
	    
	    driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[2]/div/ul/li[1]/a/img")).click();
		
		
		
		

		

	}

}
