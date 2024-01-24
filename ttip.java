package sFitademo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ttip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","T:\\Selenium\\Driver\\chromedriver-win32\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String yatURL="https://www.yatra.com/";
		driver.get(yatURL);
		WebElement tooltipp=driver.findElement(By.xpath("//a[@title='Facebook']"));
		String value=tooltipp.getAttribute("title");
		System.out.println("tooltip:"+value);
		String Expectedvalue="Facebook";
		if(value.equals(Expectedvalue)) {
			System.out.println("matched");
		}
		else {
			System.out.println("not matched");
		}
		WebElement tooltiip=driver.findElement(By.xpath("//a[@title='Twitter']"));
		String actvalue=tooltiip.getAttribute("title");
		System.out.println("tooltip:"+actvalue);
		String Expectdvalue="Twitter";
		if(actvalue.equals(Expectdvalue)) {
			System.out.println("matched");
		}
		else {
			System.out.println("not matched");
		}
		WebElement toltiip=driver.findElement(By.xpath("//a[@title='Youtube']"));
		String actulvalue=toltiip.getAttribute("title");
		System.out.println("tooltip:"+actulvalue);
		String Epctdvalue="Youtube";
		if(actulvalue.equals(Epctdvalue)) {
			System.out.println("matched");
		}
		else {
			System.out.println("not matched");
		}
		WebElement toolttiip=driver.findElement(By.xpath("//a[@title='Instagram']"));
		String actlvalue=toolttiip.getAttribute("title");
		System.out.println("tooltip:"+actlvalue);
		String Eptdvalue="Instagram";
		if(actlvalue.equals(Eptdvalue)) {
			System.out.println("matched");
		}
		else {
			System.out.println("not matched");
		}
		
	}

}
