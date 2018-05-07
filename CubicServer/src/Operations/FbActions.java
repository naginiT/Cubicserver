package Operations;

import Excel.Excell;
import Repository.fb;

public class FbActions {
	static String s;
	public  static void actions() throws Exception {
	
		Excell.Code("TestData For Profile", "C:\\Users\\NSSS KKISHORE\\Downloads\\BookStoreSummary.xlsx");
		s=Excell.RowColumn1(1, 1);
		fb.user().sendKeys(s);
		
		
		
		
		
		
		
		
		
	}
}
