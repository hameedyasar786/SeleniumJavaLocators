package selenium.automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class AElementLocators {

	public static void main(String[] args) {
	
		//Establish connection with browser
		System.setProperty("webdriver.chrome.driver" , "F:\\driver\\chromedriver.exe");
		
		//create an object of a browser to open
		ChromeDriver driver = new ChromeDriver();
		
		//open an application
		driver.get("https://www.facebook.com/");
		driver.findElementById("email").sendKeys("yasarhameed@gmail.com");
		driver.findElementById("pass").sendKeys("1234567890@@335%56");
		driver.findElementById("u_0_b").click();
		
		
		
		
		
		
		
		
		//closing an application
		//driver.close();

	}

}
