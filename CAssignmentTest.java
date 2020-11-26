package selenium.automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class CAssignmentTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver" , "F:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.ca/");
		driver.findElementById("nav-link-accountList").click();
		
		String actualTitleSignInPage="Amazon Sign Inn";
		String expectedTitleSignInPage= driver.getTitle();
		
		if(expectedTitleSignInPage.equals(actualTitleSignInPage)) {
			System.out.println("SignIn Page Title Passed");
		}
		else {
			System.out.println("SignIn Page Title Failed");
		}
		
		driver.findElementById("createAccountSubmit").click();
		driver.findElementByName("customerName").sendKeys("yasar");
		driver.findElementById("ap_email").sendKeys("pbhy365@gmail.com");
		driver.findElementById("ap_password").sendKeys("12345678@#$");
		driver.findElementById("ap_password_check").sendKeys("12345678@#$");
		driver.findElementById("continue").click();
	
		String expectedTitle= driver.getTitle();
	    String actualTitle="Authentication requireddd";
	 
		if(expectedTitle.equals(actualTitle)) {
			System.out.println(" Page Title Passed");
		}
		else {
			System.out.println("Page Title Failed");
		}
		driver.close();
	}
}
