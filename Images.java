package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Images {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");

		driver.manage().window().maximize(); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
		driver.close();


	}

}
