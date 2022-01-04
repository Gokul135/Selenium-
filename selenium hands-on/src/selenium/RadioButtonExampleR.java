package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonExampleR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();

		driver.get("http://www.leafground.com/pages/radio.html");


		WebElement radiobutton=driver.findElement(By.xpath("//*[@id=\'first\']/label[1]"));

		radiobutton.click();

		WebElement Unchecked=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[2]/input"));

		boolean check1=Unchecked.isSelected();

		WebElement checked=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[3]/input"));

		boolean check2=checked.isSelected();


		System.out.println(check1);
		System.out.println(check2);



		WebElement above40=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[3]"));

		above40.click();










	}

}
