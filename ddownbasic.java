package sFitademo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ddownbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","T:\\Selenium\\Driver\\chromedriver-win32 (2)\\chromedriver-win32\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String ddURL="https://demo.guru99.com/test/newtours/register.php";
		driver.get(ddURL);
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='country']"));
		Select dropselect=new Select(dropdown);
		dropselect.selectByIndex(5);
		
	}

}
