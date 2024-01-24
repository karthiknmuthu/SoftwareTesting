package sFitademo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upldsel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","T:\\Selenium\\Driver\\chromedriver-win32 (2)\\chromedriver-win32\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String upURL="https://demo.guru99.com/test/upload/";
		driver.get(upURL);
		WebElement upload=driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
		upload.sendKeys("T:\\B\\Nikon-D750-Image-Samples-2.jpg");
		WebElement accept=driver.findElement(By.xpath("//input[@name='terms']"));
		accept.click();
		WebElement submit=driver.findElement(By.xpath("//button[@name='send']"));
		submit.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement message=driver.findElement(By.xpath("//h3[@id='res']/center"));
		String Actualvalue=message.getText();
		System.out.println(Actualvalue);
		String Expectedvalue="has been successfully uploaded";
		if(Actualvalue.contains(Expectedvalue))
		{
			System.out.println("Matched");
		}
		else
		{
			System.out.println("Notmatched");
		}
	}

}
