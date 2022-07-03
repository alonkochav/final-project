package utilities;

import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class ManageDDT extends CommonOps {

    @DataProvider (name = "data-provider-users")
    public Object[][] getDataObject() {
        return getDataFromCSV(getData("DDTFile"));
    }

    public static List<String> readCSV(String csvFile) {
        List<String> lines = null;
        File file = new File(csvFile);
        try {
            lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
            System.out.println(lines.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static Object[][] getDataFromCSV(String filePath ){
        List<String> csvData = readCSV(filePath);
        int numRows = csvData.size();
        Object[][] data = new Object[numRows][2];
        System.out.println(numRows);
        for (int i = 0; i < csvData.size(); i++){

            data[i][0] = csvData.get(i).split(",")[0];
            System.out.println( data[i][0] );
            data[i][1] = csvData.get(i).split(",")[1];
            System.out.println( data[i][1] );
        }
        return data;


    }

}



