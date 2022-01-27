package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");

		driver.manage().window().maximize(); 
		Thread.sleep(3000);
	       driver.findElement(By.xpath("//div[text()='Java']/input")).click();
	      WebElement sec= driver.findElement(By.xpath("//div[text()='Selenium']/input"));
	      if(sec.isSelected()) {
	    	  System.out.println("Selenium is selected");
	      }
	      else {
	    	  System.out.println("Selenium is unchecked");
	      }
	       WebElement remove=driver.findElement(By.xpath("//div[text()='I am Selected']/input"));
	       if(remove.isSelected()) {
	    	   remove.click();
	    	   
	       }
	     
	       driver.findElement(By.xpath("//div[text()='Option 1']/input")).click();
	       driver.findElement(By.xpath("//div[text()='Option 2']/input")).click();
	       driver.findElement(By.xpath("//div[text()='Option 3']/input")).click();
	       driver.findElement(By.xpath("//div[text()='Option 4']/input")).click();
	       driver.findElement(By.xpath("//div[text()='Option 5']/input")).click();
	       driver.close();

	}

}
