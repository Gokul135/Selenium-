package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextboxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();

		driver.get("http://www.leafground.com/pages/Link.html");

		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/a")).click();

		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[2]/div/ul/li[1]/a/img")).click();


		WebElement emailbox=driver.findElement(By.id("email"));
		emailbox.sendKeys("test@gmail.com");

		WebElement appendentbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendentbox.sendKeys("text");

		WebElement getattribute=driver.findElement(By.name("username"));
		String Value= getattribute.getAttribute("value");

		System.out.println(Value);

		WebElement cleartext=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		cleartext.clear();

		WebElement disabledbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));

		boolean enabled=disabledbox.isEnabled();
		
		System.out.println(enabled);


	}

	private static String getAttribute(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
