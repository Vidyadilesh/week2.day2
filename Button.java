package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");

		driver.manage().window().maximize();
		driver.findElement(By.id("home")).click();
		driver.navigate().back();
		String colour=driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(colour);
		System.out.println(driver.findElement(By.id("position")).getLocation());
		System.out.println(driver.findElement(By.id("size")).getSize());
		
		driver.close();

	}

}
