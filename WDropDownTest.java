package selenium.automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WDropDownTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver" , "F:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.ca/");
		
		WebElement alldept=driver.findElementById("searchDropdownBox");
		
		alldept.sendKeys("baby");//Method 1(not Acceptable)
		
		
		Select s= new Select(alldept);//Method 2
		s.selectByIndex(5);
		
		s.selectByValue("search-alias=gift-cards");
		s.selectByVisibleText("Grocery");
		
		
		
		//driver.close();

	}

}
