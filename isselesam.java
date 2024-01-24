package sFitademo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselesam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","T:\\Selenium\\Driver\\chromedriver-win32\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String sampURL="https://www.mycontactform.com/samples.php";
		driver.get(sampURL);
		List<WebElement> multicheckbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement single:multicheckbox)
		{
			Boolean flag=single.isSelected();
			if(flag==true)
			{
				System.out.println("it is already selected");
			}
			else
			{
				single.click();
				System.out.println("it is selected by the user");
			}
		
	}
	}

}
