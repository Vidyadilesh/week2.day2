package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.linkText("Create New Account")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vidya");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Dilesh");
        driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("Vidya.swathi11@gmail.com");
        driver.findElement(By.xpath("//input[contains(@name,'reg_email_confirmation__')]")).sendKeys("Vidya.swathi11@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("12345678");
        
        WebElement day=driver.findElement(By.id("day"));
        Select date= new Select(day);
        date.selectByIndex(16);
        
        WebElement month=driver.findElement(By.id("month"));
        Select mon=new Select(month);
        mon.selectByVisibleText("Jan");
        
        WebElement year=driver.findElement(By.id("year"));
        Select yy=new Select(year);
        yy.selectByValue("1992");
		

        
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        driver.close();
        


	}

}
