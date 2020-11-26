package selenium.automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PAssignment {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "F:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	    driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.navigate().to("https://www.amazon.ca/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		WebElement allbox=driver.findElementByXPath("//*[@id='nav-search-dropdown-card']");
        List <WebElement> searchlist=allbox.findElements(By.tagName("option"));
		
		
		int size=searchlist.size();
		System.out.println("The Total number of items in the search list = " + size);
		System.out.println("The List of Items in the search List are ....");
	
		for(int i=0;i<size;i++) {
			
			System.out.println((i+1)+ " " +searchlist.get(i).getText());
			if((searchlist.get(i).getText()).equalsIgnoreCase("Electronics")){
				searchlist.get(i).click();
				
				driver.findElementByXPath("//*[@id='twotabsearchtextbox']").sendKeys("iphone");
				driver.findElementByXPath("//*[@value='Go']").click();
				System.out.println(driver.getTitle());
				break;
			}
			
			
		}
		
		driver.close();
		



	}

}
