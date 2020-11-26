package selenium.automation;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SRadioButton2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "F:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://echoecho.com/htmlforms10.htm");
		List <WebElement> grouplist=driver.findElementsByXPath("//*[@name='group1']");
		
		System.out.println("The size of group 1 elements are " + grouplist.size());
        
		for(int i=0;i<grouplist.size();i++) {
        	if(grouplist.get(i).isSelected()) {
        		
        		System.out.println("Selection of "+ grouplist.get(i).getAttribute("value")+ " is " + grouplist.get(i).isSelected());
        
        	}
        	else {
        		
        		System.out.println("Selection of "+ grouplist.get(i).getAttribute("value")+ " is " + grouplist.get(i).isSelected());
        	}
        }
		
       System.out.println("The output after User Selection");
       driver.findElementByXPath("//*[@value='Milk']").click();
      
      		for(int i=0;i<grouplist.size();i++) {
      			if(grouplist.get(i).isSelected()) {
      					
      				System.out.println("Selection of "+ grouplist.get(i).getAttribute("value")+ " is " + grouplist.get(i).isSelected());
      
      			}
      			else {
      					
      				System.out.println("Selection of "+ grouplist.get(i).getAttribute("value")+ " is " + grouplist.get(i).isSelected());
      			}
      		}
      
      
		List <WebElement> grplst=driver.findElementsByXPath("//*[@name='group2']");
		
		System.out.println("The size of group 2 elements are " + grplst.size());
        
		for(int i=0;i<grplst.size();i++) {
        	if(grplst.get(i).isSelected()) {
        		
        		System.out.println("Selection of "+ grplst.get(i).getAttribute("value")+ " is " + grplst.get(i).isSelected());
        
        	}
        	else {
        		
        		System.out.println("Selection of "+ grplst.get(i).getAttribute("value")+ " is " + grplst.get(i).isSelected());
        	}
        }
        
      System.out.println("The output after User Selection");
      driver.findElementByXPath("//*[@value='Water']").click();
      
      for(int i=0;i<grplst.size();i++) {
      	if(grplst.get(i).isSelected()) {
      		
      		System.out.println("Selection of "+ grplst.get(i).getAttribute("value") + " is " + grplst.get(i).isSelected());
      		
      	}
      	else {
    		
      		System.out.println("Selection of "+ grplst.get(i).getAttribute("value")+ " is " + grplst.get(i).isSelected());
    	}
      	
      }
      driver.close();
	}

}
