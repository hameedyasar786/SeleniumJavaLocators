package selenium.automation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class HKeysTest {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver" , "F:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	
		driver.navigate().to("https://login.yahoo.com/");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//*[@id='login-username']").sendKeys("qatest0022");
		driver.findElementByXPath("//*[@id='login-signin']").sendKeys(Keys.ENTER);
		
		//driver.close();
		

	}

}
