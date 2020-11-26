package selenium.automation;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RRadioButtonTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "F:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	  //  driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.navigate().to("http://echoecho.com/htmlforms10.htm");
		List <WebElement> grouplist=driver.findElementsByXPath("//*[@name='group1']");
		System.out.println("The size of group 1 elements are " + grouplist.size());
		
		
		for(int i=0;i<grouplist.size();i++) {
			if(grouplist.get(i).isSelected()) {
				System.out.println("The default selected button is " + grouplist.get(i).getAttribute("value"));
				break;
			}
		}
		
        driver.findElementByXPath("//*[@value='Milk']").click();
	    
        for(int i=0;i<grouplist.size();i++) {
	    	
	    	if(grouplist.get(i).isSelected()) {
	    		System.out.println( "The user selected button is " + grouplist.get(i).getAttribute("value"));
	    		break;
	    	}
	    
		}
		
	//Selection of xxx is xxx(T/F)	
		driver.close();

	}

}
