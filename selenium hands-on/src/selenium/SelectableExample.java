package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List<WebElement>  MultiSelect=driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		
		Actions actions=new Actions(driver);
		
		actions.clickAndHold(MultiSelect.get(0));
		actions.clickAndHold(MultiSelect.get(1));
		actions.clickAndHold(MultiSelect.get(2));
		actions.clickAndHold(MultiSelect.get(3));
		actions.build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
