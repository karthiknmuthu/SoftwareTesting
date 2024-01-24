package Selepra;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;


public class TestNg {
	WebDriver driver;
	@BeforeSuite                             //global setup//
	public void lunchBrowser() {

		 System.setProperty("webdriver.chrome.driver", "F:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 this.driver = driver;
		 String URL ="https://www.mycontactform.com/samples.php";
		 driver.get(URL);
		 driver.manage().window().maximize();
	}
	@Test
	@BeforeClass
	public void Title() {
		String title=driver.getTitle();
		String ExceptedTitle = "Sample Email Forms - myContactForm.com";
		if(title.equals(ExceptedTitle)) {
		System.out.print("Titel of the web page:"+title);
		}
		else {
			System.out.print("Test Case Fail The Name Of The Page is "+ title);
		}
   }
	@Test
	@BeforeClass
	public void Subject() {
		 WebElement Subject = driver.findElement(By.xpath("//input[@id='subject']"));
		 	Subject.sendKeys("Application for markting");
	}
	@Test
	public void CheckBox(){
		 WebElement Clickbox1=driver.findElement(By.xpath("//input[@value='0']"));
		 Clickbox1.click();
	}
	@Test
	public void MulitpleT() {
		WebElement MultiText = driver.findElement(By.xpath("//textarea[@id='q2']"));
		 MultiText.sendKeys("The variety and types of email forms that you can create with myContactForm.com are virtually endless. We have created a system that can be completely tailored to fulfill any of your data submission needs. We offer both the ability to create forms from templates or create custom forms from scractch. The sample form below shows the large variety of field types and questions that are available for your forms. To the left, we have listed a number of forms that can be used as templates. If you can dream it, you can create it!");
	}
	@Test
	public void Date() {
		WebElement selectdate = driver.findElement(By.xpath("//input[@id='q7']"));
		selectdate.click();
		 WebElement DateMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
			Select month = new Select(DateMonth);
			month.selectByVisibleText("Nov");
			
			WebElement Dateyear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
			Select year = new Select(Dateyear);
		    year.selectByVisibleText("2001");
		 
		 List<WebElement>multidate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		
		 for(WebElement single:multidate)
		 {
		 String Actualvalue=single.getText();
		 String Expectedvalue="5";
		
		 if(Actualvalue.equals(Expectedvalue)) {
		 single.click();
		 System.out.println("matched");
		 break;
		 }
		 else {
		 System.out.println("not matched");
		 }

	}
}
}