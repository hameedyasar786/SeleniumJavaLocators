package selenium.automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class DXpathTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver" , "F:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		// Syntax of XPath: //TagName[@Keyname='KeyValue'];==> Relative XPATH
		///html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input ==>Position XPATH
		
		driver.findElementByXPath("//input[@data-testid=\"royal_email\"]").sendKeys("qatest0022@gmail.com");
		driver.findElementByXPath("//*[@data-testid='royal_pass']").sendKeys("123456");
		//driver.findElementByXPath("//button[@data-testid=\"royal_login_button\"]").click();
		
		//CSS Selectors
		driver.findElementByCssSelector("[data-testid=\"royal_login_button\"]").click();
		
		driver.close();
	}

}
