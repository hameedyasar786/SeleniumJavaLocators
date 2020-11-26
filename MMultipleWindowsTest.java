package selenium.automation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class MMultipleWindowsTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "F:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	    driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//*[@id='openwindow']").click();
		Set <String> allwindows=driver.getWindowHandles();
		System.out.println("Total number of windows opened= " +allwindows.size());
		
		Iterator<String> itr= allwindows.iterator();
		
		String mainwindow=itr.next();
		String childwindow=itr.next();
		
		driver.switchTo().window(mainwindow);
		System.out.println("The Title of main window = " +driver.getTitle());
		
		driver.switchTo().window(childwindow);
		System.out.println("The Title of child window = " +driver.getTitle());
		
		driver.findElementByLinkText("COURSES").click();
		
		driver.switchTo().window(mainwindow);
		System.out.println("The Title of main window2 = " +driver.getTitle());
		
		driver.close();

	}

}


