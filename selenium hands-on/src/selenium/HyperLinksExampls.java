package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HyperLinksExampls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

		driver.navigate().to("http://www.leafground.com/pages/Link.html");

		WebElement Homepage=driver.findElement(By.linkText("Go to Home Page"));

		Homepage.click();

		driver.navigate().back();

		WebElement Wheretogo=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/a"));

		String where= Wheretogo.getAttribute("href");

		System.out.println("Where am supposed to go :"+where);

		WebElement Brokenlink=driver.findElement(By.partialLinkText("I broken"));
		Brokenlink.click();

		String Title= driver.getTitle();

		if(Title.contains("404")) {

			System.out.println("It is a Broken link");
		}

		driver.navigate().back();

		WebElement Homepage1=driver.findElement(By.linkText("Go to Home Page"));

		Homepage1.click();
  
		driver.navigate().back();
		
		List<WebElement> Totallinks=	driver.findElements(By.tagName("a"));
		
   int NumofLinks=Totallinks.size();

   System.out.println("Total num of links in this pages is "+NumofLinks);
   
	}















}


