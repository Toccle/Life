package pack.life;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

    public void readXLSX(int numRow){

    }

    public void writeXLSX(int numRow) throws FileNotFoundException {
        FileInputStream file = new FileInputStream(new File("db.xlsx"));
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
        } catch (NoClassDefFoundError e) {
            e.printStackTrace();
        }
    }




}
