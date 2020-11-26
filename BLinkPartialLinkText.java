package selenium.automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class BLinkPartialLinkText {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver" , "F:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElementByLinkText("Advertising").click();
		driver.findElementByPartialLinkText("Adver").click();
	}

}
