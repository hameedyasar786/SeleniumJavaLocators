package selenium.automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class EGmailTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "F:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com/");
		
		driver.findElementByLinkText("Business").click();
		System.out.println("Title= " + driver.getTitle());
		driver.close();
	}

}
