package selenium;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBoxExampleR {

	public static void main(String[] args) {

		// TODO Auto-generated method stub



		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();

		driver.get("http://www.leafground.com/pages/checkbox.html");




		WebElement check1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));

		check1.click();


		WebElement check2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));

		boolean isselect=check2.isSelected();

		System.out.println(isselect);





		WebElement firstelement=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));

		if (firstelement.isSelected()) {

			firstelement.click();

		}


		WebElement secondelement=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));



		if (secondelement.isSelected()) {

			secondelement.click();
		}



		WebElement selectoption1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[1]/input"));


		selectoption1.click();

		WebElement selectoption2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[2]/input"));


		selectoption2.click();








	}

}
