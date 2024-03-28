package Utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadExcell {
    public final static String directory = System.getProperty("user.dir") + "/src/test/java/TestData/TestFile.xlsx";

    FileInputStream dir = new FileInputStream(directory);

    XSSFWorkbook xssfWorkbook = new XSSFWorkbook(dir);

    XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);

    public ReadExcell() throws IOException {
    }

    public List<String> searchValues() {

        List<String> cellValues = new ArrayList<>();
        try {


            // Iterate through each row
            for (Row row : xssfSheet) {
                // Iterate through each cell in the row
                for (Cell cell : row) {
                    // Check if the cell value is not empty
                    if (cell.getCellType() != CellType.BLANK) {
                        // Insert the value into the search textbox
                        cellValues.add(cell.getStringCellValue());
                    }
                }
            }

            // Close the workbook
            xssfWorkbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cellValues;
    }
       //public  String item_1= xssfSheet.getRow(0).getCell(0).getStringCellValue();
}
