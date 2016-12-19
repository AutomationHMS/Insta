package com.libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XlLibrary {
	
	public String getCellValue(String fileName, String sheetName, int rowNum, int cellNum) {
		String retVal=null;
		try {
			FileInputStream fis = new FileInputStream(fileName);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetName);
			Row r = s.getRow(rowNum);
			Cell c = r.getCell(cellNum);
			retVal = c.getStringCellValue();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return retVal;
	}
	
	public void setCellValue(String fileName, String sheetName, int rowNum, int cellNum, String data) {
		try {
			FileInputStream fis = new FileInputStream(fileName);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetName);
			Row r = s.getRow(rowNum);
			Cell c = r.createCell(cellNum);
			c.setCellValue(data);
			FileOutputStream fos = new FileOutputStream(fileName);
			wb.write(fos);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int getRowCount(String fileName, String sheetName) {
		int rowCount = 0;
		try {
			FileInputStream fis = new FileInputStream(fileName);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetName);
			rowCount = s.getLastRowNum();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}
	
/*	public CellAddress searchStringInXslx(String filename,String sheetName,String string) throws IOException {
		FileInputStream inputStream = new FileInputStream(filename);
		Workbook workbook = new XSSFWorkbook(inputStream);
		//Sheet firstSheet = workbook.getSheetAt(0);
		Iterator<Row> iterator = sheetName.iterator();
		CellAddress columnNumber=null;
		while(iterator.hasNext()){
			Row nextRow = iterator.next();
			Iterator<Cell> cellIterator = nextRow.cellIterator();
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				if(cell.getCellType()==Cell.CELL_TYPE_STRING){
					String text = cell.getStringCellValue(
						if (string.equals(text)) {
							columnNumber=cell.getAddress();
							break;
						}
				}
			}
		}
		workbook.close();
		return columnNumber;
     }	*/
}
