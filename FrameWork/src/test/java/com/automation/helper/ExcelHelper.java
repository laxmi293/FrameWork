package com.automation.helper;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelHelper {
	public static String[][] getTestData() throws Exception {
		String[][] data=null;
		Workbook workbook=WorkbookFactory.create(new FileInputStream(new File("E:\\Excel.xlsx")));
		Sheet sheet=workbook.getSheet("sheet1");
		data=new String[sheet.getPhysicalNumberOfRows()][sheet.getRow(0).getPhysicalNumberOfCells()];
		for(int rowIndex=0;rowIndex<sheet.getPhysicalNumberOfRows();rowIndex++) {
			for(int colIndex=0;colIndex<sheet.getRow(rowIndex).getPhysicalNumberOfCells();colIndex++) {
				data[rowIndex][colIndex]=sheet.getRow(rowIndex).getCell(colIndex).toString();
			}
		}
		workbook.close();
		return data;
}

}
