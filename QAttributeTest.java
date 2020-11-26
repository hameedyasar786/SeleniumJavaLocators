package selenium.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class QAttributeTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "F:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	    driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.navigate().to("http://echoecho.com/htmlforms10.htm");
		System.out.println(driver.findElementByName("group1").getAttribute("type"));
		System.out.println(driver.findElementByName("group2").getAttribute("value"));
	
	}

}
