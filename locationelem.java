package sFitademo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locationelem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","T:\\Selenium\\Driver\\chromedriver-win32\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
		
		
		System.out.println("Before maximizing window:"+logo.getLocation()); //(273, 54)
		
		driver.manage().window().maximize();
		System.out.println("After maximizing window:"+logo.getLocation());  //(371, 40)
		
		driver.manage().window().minimize();
		System.out.println("After minimizing window:"+logo.getLocation()); //(273, 40)
	
		driver.manage().window().fullscreen();
		System.out.println("After Full screen window:"+logo.getLocation());  //(374, 83)
		
		Point p=new Point(100,100);
		driver.manage().window().setPosition(p);
		System.out.println("After setting window 100 * 100:"+logo.getLocation());  //(273, 40)
		
		
	}

}
