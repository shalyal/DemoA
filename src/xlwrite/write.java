package xlwrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class write {

	@Test
	public static void writeToXl() throws Exception {
		Workbook w = WorkbookFactory.create(new FileInputStream("./result1/res.xlsx"));
		w.getSheet("Sheet1").getRow(1).getCell(0).setCellValue(10);
		//		w.getSheet("Sheet1").createRow(1).createCell(1).setCellValue(5);
		w.write(new FileOutputStream("./result1/res.xlsx"));
	}
}
