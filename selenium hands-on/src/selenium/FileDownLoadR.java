package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindAll;

public class FileDownLoadR {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	    System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	  
	    driver.get("http://www.leafground.com/pages/download.html");
	    
	    WebElement Download=driver.findElement(By.linkText("Download Excel"));
	    Download.click();
	    
	    Thread.sleep(3000);
		
       File Filelocation=new File("C:\\Users\\civil\\Downloads");
       
       File[] Totalfiles=Filelocation.listFiles();
       
    for (File file : Totalfiles) {
		
    if(	file.getName().equals("testleaf.xlsx")) {
    
 
    	
    	System.out.println(file);
    	
    	break;
    }
	}
       
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
