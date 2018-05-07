package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class fb extends OpenBrowser {
	static By user=By.name("email");
	static By pswd=By.id("pass");
	static By loginBtn=By.cssSelector("#u_0_4");
	public static WebElement user() {
		
		return driver.findElement(user);
		
	}


	public static WebElement pswd() {
		
		return driver.findElement(pswd);
		
	} 

	public static WebElement Btn() {    
		
			return driver.findElement(loginBtn);
		
	}
	
	
}
