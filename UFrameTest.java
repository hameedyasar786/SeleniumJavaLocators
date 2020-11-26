package selenium.automation;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UFrameTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "F:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	   // driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.navigate().to("https://jqueryui.com/droppable");
		
		List<WebElement> resize=driver.findElementsByLinkText("Resizable");
		System.out.println("Resizable is "+ resize.size());
		
	    List<WebElement> drag=driver.findElementsById("draggable");
		System.out.println("Draggable is "+ drag.size());
		
		driver.switchTo().frame(0);
		List<WebElement> resize1=driver.findElementsByLinkText("Resizable");
		System.out.println("Resizableone is "+ resize1.size());
		
		List<WebElement> drag1=driver.findElementsById("draggable");
		System.out.println("Draggableone is "+ drag1.size());
		
		
		driver.switchTo().defaultContent();
		List<WebElement> resize2= driver.findElementsByLinkText("Resizable");
		System.out.println("Resizabletwo  is "+ resize2.size());
		
		driver.switchTo().defaultContent();
		List<WebElement> drag2= driver.findElementsById("draggable");
		System.out.println("Draggable two is "+ drag2.size());
		
		driver.close();
		
	}

}
