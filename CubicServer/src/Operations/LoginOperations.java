package Operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Excel.ExcelCode;
import Excel.Excell;
import Repository.InspectElements;

public class LoginOperations  {

static String s;

			public  static void actions() throws Exception {
				
				InspectElements.profile().click();
				Thread.sleep(3000);
				Excell.Code("TestData For Profile", "C:\\Users\\NSSS KKISHORE\\Downloads\\BookStoreSummary.xlsx");
							InspectElements.name().clear();
							s=Excell.RowColumn1(1, 1);
						InspectElements.name().sendKeys(s);
						
						
						
						
						
						
						
						
						
						
						
						
						
					/*		Thread.sleep(3000);			
			
	InspectElements.email().clear();
	//Thread.sleep(3000);
	cell=sheet.getRow(1).getCell(3);
	Thread.sleep(3000);
	InspectElements.email().sendKeys(cell.getStringCellValue());
	Thread.sleep(3000);
	InspectElements.password().clear();
	//Thread.sleep(3000);

	cell=sheet.getRow(1).getCell(4);
	Thread.sleep(3000);
	InspectElements.password().sendKeys(cell.getStringCellValue());
	//Thread.sleep(3000);
	InspectElements.confirmpassword().clear();
	//Thread.sleep(3000);
	cell=sheet.getRow(1).getCell(5);
	Thread.sleep(3000);
	InspectElements.confirmpassword().sendKeys(cell.getStringCellValue());
	Thread.sleep(3000);

	InspectElements.update().click();
	Thread.sleep(5000);
InspectElements.reset().click();
InspectElements.java().click();
Thread.sleep(3000);

InspectElements.questions().click();
Thread.sleep(3000);

InspectElements.cuttoff().click();
Thread.sleep(4000);
InspectElements.serverOff().click();

}
*/	

			}
	
}



