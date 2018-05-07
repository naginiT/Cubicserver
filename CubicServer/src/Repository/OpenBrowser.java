package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	
	
	
	public static WebDriver driver;
	public static void browser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NSSS KKISHORE\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		 driver=new ChromeDriver();
		// driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");

		                                        
	}
	public static void open() {                      
	driver.get("https://www.facebook.com/");
	}
	public static  void maximize() { 
		driver.manage().window().maximize();
	}
	public static  void close() { 
		driver.close();
	}
	}
	
	

