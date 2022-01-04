package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();

		driver.get("http://www.leafground.com/pages/Dropdown.html");

		WebElement selectoptionbyindex=driver.findElement(By.id("dropdown1"));


		Select optionbyindex=new Select(selectoptionbyindex);

		optionbyindex.selectByIndex(1);

		optionbyindex.selectByValue("2");

		optionbyindex.selectByVisibleText("Loadrunner");

		List<WebElement> listofoptions= optionbyindex.getOptions();
		int size=listofoptions.size();

		System.out.println("Number of option is:"+size);



       selectoptionbyindex.sendKeys("Loadrunner");
       
       WebElement multiselect=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
       
       Select multiselectbox=new Select(multiselect);
       
       multiselectbox.selectByIndex(1);
       multiselectbox.selectByIndex(2);
       multiselectbox.selectByIndex(3);
    
       
       
       
       
      
      


	}

}
