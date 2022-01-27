package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");

		driver.manage().window().maximize(); 
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.linkText("Go to Home Page")).getAttribute("href"));
	
		System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
		String url=driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href");
		System.out.println("The url is"+url);
		if(url.contains("error.html")) {
		System.out.println("yes it is broken");
		}
		else {
			System.out.println("No, the url is not broken");
		}
		System.out.println(driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).getAttribute("href"));
		

				
		driver.close();

	}

}
