package selenium.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TMouseHover {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "F:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	    driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.navigate().to("https://www.amazon.ca/");
		WebElement mouseHoverButton=driver.findElementByXPath("//*[@id='nav-link-accountList']");
		Actions builder=new Actions(driver);
		builder.moveToElement(mouseHoverButton).build().perform();
		//driver.close();
	}

}
