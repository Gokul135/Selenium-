package selenium;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonexampleR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();

		driver.get("http://www.leafground.com/pages/Button.html");
		
		WebElement click=driver.findElement(By.xpath("//*[@id=\'home\']"));

		click.click();
		
		WebElement findposition=driver.findElement(By.id("position"));
		Point position=findposition.getLocation();

		int xvalue=position.getX();
		int yvalue=position.getY();

		System.out.println("x value is :"+xvalue+"y value is :"+yvalue);    

		WebElement findcolor=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/label"));

		String backgroundcolor=findcolor.getCssValue("background-color");

		System.out.println("background color is :"+backgroundcolor);


		WebElement findsize=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div"));

		int height=findsize.getSize().getHeight();

		int width=  findsize.getSize().getWidth();

		System.out.println("Height is:"+height+"Width is :"+width);

		
	
	}

}
