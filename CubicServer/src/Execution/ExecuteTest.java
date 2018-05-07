package Execution;

import org.testng.annotations.Test;

import Excel.ExcelCode;
import Operations.LoginOperations;
import Repository.OpenBrowser;

public class ExecuteTest {

	@Test
	public void Exe() throws Exception{
		OpenBrowser.browser();
		OpenBrowser.maximize();
		OpenBrowser.open();
		
		ExcelCode.perform();
		LoginOperations.actions();
		
		
	}
	
	
}
