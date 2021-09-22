package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UniqueTrainList {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://erail.in/");
		driver.findElement(By.id("chkSelectDateOnly")).click();
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("NDLS",Keys.ENTER);
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("MMCT",Keys.ENTER);
		driver.findElement(By.id("buttonFromTo")).click();

		Thread.sleep(2000);
		List<WebElement> trainList = driver.findElements(By.xpath("//td[@style=';']/a"));
		List<String> str=new ArrayList<String>();
		for(WebElement list:trainList)
		{
			
			str.add(list.getText());
			
		}
		System.out.println(str);
		int size = str.size();
		System.out.println("The size od list is"+size);
		Set<String> str1= new HashSet<String>(str);	
		System.out.println(str1);
		}

}
