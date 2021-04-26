import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.hssf.usermodel.*;

import java.io.File;
import java.io.IOException;

public class testPoi {

    public static void main(String[] args) throws IOException {

        HSSFWorkbook workbook = new HSSFWorkbook();
        //创建个空白的sheet
        HSSFSheet sheet = workbook.createSheet("Sheet 1=2"); // 工作表
        HSSFCreationHelper creationHelper = workbook.getCreationHelper();


        //获取现有的sheet
//        HSSFSheet sheet = workbook.getSheet("Sheet 1"); // 工作表

        for (int rowIndex = 0; rowIndex < 10; rowIndex++) {
            HSSFRow row = sheet.createRow(rowIndex); // 创建行
            for (int columnIndex = 0; columnIndex < 10; columnIndex++) {
                if (rowIndex == 0 && columnIndex == 0) { // 首行首列
                    sheet.setColumnWidth(columnIndex, 256 * 20); // 设置列宽，第二个参数表示十个字符宽度
                }
                HSSFCell cell = row.createCell(columnIndex); // 创建列
                cell.setCellValue("R" + rowIndex + ":C" + columnIndex);
//                if (rowIndex == columnIndex) {
//                    HSSFFont font = workbook.createFont();
//                    font.setColor(IndexedColors.RED.getIndex()); // 字体颜色
//                    HSSFCellStyle cellStyle = workbook.createCellStyle(); // 创建样式
//                    cellStyle.setFont(font);
//                    cell.setCellStyle(cellStyle); // 设置样式
                if (columnIndex == 0) {
                    HSSFHyperlink hyperlink = creationHelper.createHyperlink(HyperlinkType.URL);
                    hyperlink.setAddress("https://www.baidu.com/");
                    cell.setHyperlink(hyperlink);
                }
//                }
            }
        }

//        FileOutputStream out = new FileOutputStream("sample.xls");
//        workbook.write(out);
//        System.out.println("OK");

        workbook.write(new File("test.xls"));
        workbook.close();
//        out.close();
    }
}
