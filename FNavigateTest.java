package selenium.automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class FNavigateTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "F:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		System.out.println("Title 1= " +driver.getTitle());
		
		driver.findElementByLinkText("Business").click();
		System.out.println("Title 2= " + driver.getTitle());
		
		driver.navigate().back();
		System.out.println("Title 3= " + driver.getTitle());
		
		driver.navigate().forward();
		System.out.println("Title 4= "+driver.getTitle());
		driver.close();
		
		
		
	}

}
