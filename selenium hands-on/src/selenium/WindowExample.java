package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.zeromq.ZStar.Set;

public class WindowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", 
				"C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Window.html");

		String oldwindow=driver.getWindowHandle();

		WebElement openhome=driver.findElement(By.id("home"));
		openhome.click();

		java.util.Set<String> handles = driver.getWindowHandles();

		for (String newwindows : handles) {
			driver.switchTo().window(newwindows);
		}
		WebElement editbox=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/h5"));
		editbox.click();

		driver.close();

		driver.switchTo().window(oldwindow);

		WebElement multiplewindow=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));

		multiplewindow.click();

		int numofwindows= driver.getWindowHandles().size();

		System.out.println("numberofwindows:");

		WebElement dontclose=driver.findElement(By.xpath("//*[@id=\'color\']"));

		dontclose.click();

		java.util.Set<String>Newwindows= driver.getWindowHandles();


		for (String allwindows : Newwindows) {

			if (!allwindows.equals(Newwindows)) {
				driver.switchTo().window(allwindows);
				driver.close();
				driver.quit();

			}
		}

































	}

}
