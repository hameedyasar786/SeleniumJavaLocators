package selenium.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class OAlertTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "F:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	    driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//*[@name='enter-name']").sendKeys("YASAR");
		driver.findElementByXPath("//*[@id='alertbtn']").click();
		
		Alert alertMsg=driver.switchTo().alert();
		
		String ExpectedAlertMsg="Hello yasar, share this practice page and share your knowledge";
		String ActualAlertMsg=alertMsg.getText();
		
		System.out.println("The Actual Alert Message =" +ActualAlertMsg);
		
		if(ExpectedAlertMsg.equalsIgnoreCase(ActualAlertMsg)) {
			System.out.println("Accept the alert msg");
      		alertMsg.accept();
		}
		else {
			System.out.println("The assertion fail");
		}
		
		
		driver.close();

	}

}
