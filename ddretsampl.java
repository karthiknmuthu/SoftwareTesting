package sFitademo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ddretsampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","T:\\Selenium\\\\Driver\\chromedriver-win32 (2)\\chromedriver-win32\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String ddURL="https://demo.guru99.com/test/newtours/register.php";
		driver.get(ddURL);
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='country']"));
		Select obj=new Select(dropdown);
		List<WebElement> multivalue=obj.getOptions();
		for(WebElement single:multivalue)
		{
			String value=single.getText();
			String Expectedvalue="INDIA";
			if(value.equals(Expectedvalue)) {
				System.out.println("matched");
				break;
			}
			else {
				System.out.println("not matched");
			}
		}
	}

}
