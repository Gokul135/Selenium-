package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkboxExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		
        WebDriver driver=new FirefoxDriver();
        
        driver.get("http://www.leafground.com/pages/checkbox.html");
        
        WebElement click=driver.findElement(
        		By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[5]/input"));
       
        click.click();
		
		WebElement selenium=driver.findElement(
				By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
		
		boolean confirm=selenium.isSelected();
		
		System.out.println(confirm);
		
		WebElement deselectbox1=driver.findElement(
				By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
		if (deselectbox1.isSelected()) {
			
			deselectbox1.click();
			
			
		}
		
		
		WebElement deselectbox2=driver.findElement(
				By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
		if (deselectbox2.isSelected()) {
			
			deselectbox2.click();
			
			
		}
		
		WebElement selectall=driver.findElement(
				By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[1]/input"));
		selectall.click();
		
		WebElement selectall1=driver.findElement(
				By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[2]/input"));
		
		selectall1.click();
		
		WebElement selectall2=driver.findElement(
				By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[3]/input"));
		
		
		selectall2.click();
		
		
		
		
		
		
		
		
		
	}

}
