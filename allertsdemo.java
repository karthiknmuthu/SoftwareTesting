package sFitademo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allertsdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","T:\\Selenium\\Driver\\chromedriver-win32\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String demoURL="https://demoqa.com/alerts";
		driver.get(demoURL);
		WebElement clickalrt=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		clickalrt.click();
		Thread.sleep(3000);
		String actual=driver.switchTo().alert().getText();
		System.out.println(actual);
		driver.switchTo().alert().dismiss();
		String Expectedval="Do you confirm action?";
		if(actual.equals(Expectedval)) {
			System.out.println("matched");
		}
		else {
			System.out.println("not matched");
		}
	}

}
