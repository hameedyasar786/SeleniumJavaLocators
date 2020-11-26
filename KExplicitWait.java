package selenium.automation;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KExplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "F:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	    
		driver.get("https://www.walmart.ca");
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Deals").click();
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@itemprop='name'])[2]")));
		System.out.println("The Title of Deals Page="+driver.getTitle());
		driver.close();

	}

}
