package meet8.fileoperation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ammfat
 */
public class CSVReadWrite {
    public static void main(String[] args) {
        ArrayList<String[]> data = new ArrayList<>();
        final var PATH = "src/meet8/fileoperation/";
        
        // Read File
        
        try (BufferedReader csvReader = new BufferedReader(new FileReader(PATH + "data/products.csv"))) {
            String line;
            
            while ((line = csvReader.readLine()) != null) {
                String[] item = line.split(",");
                
                data.add(item);
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        
        for (var d : data) {
            for (String elem : d) {
                System.out.print(elem + " | ");
            }
            System.out.println("");
        }
        
        // Append Data
        String[] toAppend = {"999", "\"Water Bottle - 30 oz.\"", "Bottles and Cages"};
        String delimiter = ",";
        String toAppendStr = String.join(delimiter, toAppend) + "\n";
        
        System.out.println(toAppendStr);
        
        // Append to File
        try(var csvWriter = new FileWriter(PATH + "output/products-append.csv", true)) {
            csvWriter.append(toAppendStr);
            System.out.println("Data successfully append.");
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
