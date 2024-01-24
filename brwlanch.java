package sFitademo;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brwlanch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","T:\\Selenium\\Driver\\chromedriver-win32 (2)\\chromedriver-win32\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		
		
		String whURL="https://www.demo.guru99.com/popup.php";
		driver.get(whURL);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String MainWindow=driver.getWindowHandle();
		System.out.println(MainWindow);
		WebElement clickhere=driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
		clickhere.click();
		Thread.sleep(800);
		Set<String>s1=driver.getWindowHandles();
		Iterator<String>i1=s1.iterator();
		while(i1.hasNext())
		{
			String ChildWindow=i1.next();
			if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				WebElement email=driver.findElement(By.xpath("//input[@name='emailid']"));
				email.sendKeys("stsrjgkgglll");
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(MainWindow);
	}

}
