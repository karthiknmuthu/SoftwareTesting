package sFitademo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ttextget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","T:\\Selenium\\Driver\\chromedriver-win32\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String tbURL="https://demo.guru99.com/test/accessing-nested-table.html";
		driver.get(tbURL);
		WebElement Secondcell=driver.findElement(By.xpath("(//table/tbody/tr)[2]/td[2]"));
		String Actualvalue=Secondcell.getText();
		System.out.println(Actualvalue);
		String Expectedvalue="TWO";
		if(Actualvalue.equals(Expectedvalue))
		{
			System.out.println("Matched");
		}
		else
		{
			System.out.println("Notmatched");
		}
	}

}
