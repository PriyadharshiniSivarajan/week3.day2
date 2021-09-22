package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://erail.in/");
		driver.findElement(By.id("chkSelectDateOnly")).click();
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MS", Keys.ENTER);
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("BCT",Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> trainNameList = driver.findElements(By.xpath("//td[@style=';']/a"));
		List<String> sortedNames=new ArrayList<String>();
		
		for(WebElement name:trainNameList)
		{
			String text = name.getText();
			sortedNames.add(text);
			Collections.sort(sortedNames);
			System.out.println(text);
		}
		
		

	}

}
