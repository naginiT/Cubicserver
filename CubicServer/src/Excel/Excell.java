package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excell {
	static XSSFWorkbook workbook;
	static XSSFSheet Sheet;
	 static XSSFCell cell;
static String a;

public static void Code(String sheet, String path) throws Exception{
	

FileInputStream fis=new FileInputStream(path);
 workbook= new XSSFWorkbook(fis);
 Sheet= workbook.getSheet(sheet);

}
public static String  RowColumn1(int row, int column)
{
	cell=Sheet.getRow(row).getCell(column);
	a=cell.getStringCellValue();
	return a;
}
}