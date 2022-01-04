package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadExample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

	    System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	  
	    driver.get("http://www.leafground.com/pages/upload.html");
		
		WebElement uploadbutton=driver.findElement(By.xpath("//*[@id=\'mydiv\']/input"));
		uploadbutton.click();
		
		Thread.sleep(3000); 
		
		
		
		String file="C:\\Users\\civil\\Downloads\\testleaf.xlsx";
		
		StringSelection  selection=new StringSelection(file);
		
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot robot=new Robot();
		
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	
	Thread.sleep(3000);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
