package Selenium;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite2 {


    private static final String FILE_NAME = System.getProperty("user.dir") + "\\ExcelExample2.xlsx";

    public static void main(String[] args) {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Devices");
        Object[][] datatypes = {
                {"Brand", "Type", "Price", "Year"},
                {"Apple", "Laptop", 1000, 2017},
                {"Samsung", "Smartphone", 800, 2018},
                {"Nokia", "Just mobile", 130, 2015},
                {"Xiaomi", "Laptop", 1000, 2018},
                {"HP", "Printer", 200, 2014}
        };
        int rowNum = 0;
        System.out.println("Creating excel");


        for (Object[] datatype: datatypes) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : datatype) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }


try {
        FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
        workbook.write(outputStream);
        workbook.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }

            System.out.println("Done");
    }
}
