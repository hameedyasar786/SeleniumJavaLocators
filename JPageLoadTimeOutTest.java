package selenium.automation;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class JPageLoadTimeOutTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "F:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(3000,TimeUnit.SECONDS);
		driver.navigate().to("https://www.walmart.ca");
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Deals").click();
		System.out.println("The Title of Deals Page="+driver.getTitle());
		driver.close();

	}

}
