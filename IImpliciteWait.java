package selenium.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class IImpliciteWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "F:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	    driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.navigate().to("https://www.walmart.ca");
		driver.manage().window().maximize();
		
		String actualTitle= driver.getTitle();
		System.out.println("The Actual Title="+actualTitle);
		String expectedTitle="Online Shopping Canada: Everyday Low Prices at Walmart.ca!";
		System.out.println("The Expected Title= "+expectedTitle);
		
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("The  Walmart page validation Passed" );
			driver.findElementByLinkText("Deals").click();
			System.out.println("The Title of Deals Page="+driver.getTitle());
		}
		else{
			System.out.println("The Walmart page validation Failed");
		}
		driver.close();
		
	}

}
