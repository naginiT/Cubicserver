package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InspectElements extends OpenBrowser{

	static By user=By.name("email");
	static By pswd=By.id("userPw");
	static By loginBtn=By.cssSelector("#reg_form > fieldset > div:nth-child(3) > div > button.btn.btn-success.btn-lg");
	static By profile= By.cssSelector("#bs-example-navbar-collapse-1 > ul > li:nth-child(2) > a > span");
	static By FullNname =By.name("name");
	static By email =By.name("email");
	static By password =By.id("userPw");
	static By confirmpassword =By.name("confirmPassword");
	static By update =By.cssSelector("#reg_form > fieldset:nth-child(3) > div:nth-child(4) > div > button.btn.btn-large.btn-success");
	static By reset =By.cssSelector("#reg_form > fieldset:nth-child(3) > div:nth-child(4) > div > button.btn.btn-large.btn-warning");
	static By java =By.cssSelector("#bs-example-navbar-collapse-1 > ul > li:nth-child(3) > a > span");
	static By questions =By.cssSelector("#bs-example-navbar-collapse-1 > ul > li.dropdown > a > span");
	static By cuttoff =By.cssSelector("#bs-example-navbar-collapse-1 > ul > li.dropdown.open > ul > li:nth-child(2) > a");
	static By serveroff =By.xpath("/html/body/div[2]/table/tbody/tr[4]/td[4]/font/input");



	




public static WebElement user() {
	
	return driver.findElement(user);
	
}


public static WebElement pswd() {
	
	return driver.findElement(pswd);
	
} 

public static WebElement Btn() {    
	
		return driver.findElement(loginBtn);
	
}
public static WebElement profile() {    
	
	return driver.findElement(profile);

}
public static WebElement name() {    
	
	return driver.findElement(FullNname);

}
public static WebElement email() {    
	
	return driver.findElement(email);

}
public static WebElement password() {    
	
	return driver.findElement(password);

}
public static WebElement confirmpassword() {    
	
	return driver.findElement(confirmpassword);

}
public static WebElement update() {    
	
	return driver.findElement(update);

}
public static WebElement reset() {    
	
	return driver.findElement(reset);
	//System.out.println("Clicked on reset");
	
}
public static WebElement java() {    
	
	return driver.findElement(java);

}
public static WebElement questions() {    
	
	return driver.findElement(questions);

}
public static WebElement cuttoff() {    
	
	return driver.findElement(cuttoff);

}
public static WebElement serverOff() {    
	
	return driver.findElement(serveroff);

}

}


