package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@class='length']")).getText());
	    List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']"));
	   int size = brand.size();
	   System.out.println("Total available brands are"+size);
	   for(WebElement Brand:brand)
	   {
	System.out.println(Brand.getText());
	   }
	 List<WebElement> bagName = driver.findElements(By.xpath("//div[@class='name']"));
	 System.out.println("Total bag names"+bagName.size());
	 System.out.println("The baganmes are");
	 for(WebElement names:bagName)
	 {
		 System.out.println(names.getText());
	 }
	   
	   
		
		
	}

}
