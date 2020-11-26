package selenium.automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class NScreenShotTest {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver" , "F:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	    
		driver.get("https://www.facebook.com");
		
	    File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(srcfile,new File("F:\\ScreenShot\\fb.jpeg"));
		FileUtils.copyFile(srcfile,new File("F:\\ScreenShot\\fb.png"));
		driver.close();

	}

}
