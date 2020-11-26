package selenium.automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VDragNDropTest {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver" , "F:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://jqueryui.com/droppable");
		
		driver.switchTo().frame(0);
		
		WebElement dragme=driver.findElementById("draggable");
		WebElement droponme=driver.findElementById("droppable");
		
		Actions builder=new Actions(driver);
		builder.dragAndDrop(dragme, droponme).build().perform();
		
		
		
		driver.close();

	}

}
