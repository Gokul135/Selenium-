package selenium;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

		driver.navigate().to("http://www.leafground.com/pages/table.html");

		List<WebElement> Numberofcolumn=driver.findElements(By.tagName("th"));

		int TotalColumn=	Numberofcolumn.size();

		System.out.println("Column is :"+TotalColumn);

		List<WebElement> Numberofrows=driver.findElements(By.tagName("tr"));

		int Totalrows=	Numberofrows.size();

		System.out.println("Row is  :"+Totalrows);

		WebElement getpercent=driver.findElement(By.xpath("//td[text()=\"Learn to interact with Elements\"]/following::td"));
		String Percentage=	getpercent.getText();

		System.out.println("Percentage is :"+Percentage);

		List<WebElement> Allprogress=driver.findElements(By.xpath("//td[2]"));

		List<Integer> Numberlist=new ArrayList<Integer>();

		for (WebElement webElement : Allprogress) {

			String Individuals=webElement.getText().replaceAll("%", "");
			Numberlist.add(Integer.parseInt(Individuals));

		}


		System.out.println("Final List :"+Numberlist);

		int  smallvalue=Collections.min(null);
		System.out.println(smallvalue);

		String FinalXpath="//td[normalize-space()=";\""+smallvaluestring+"\""+




	}

}
