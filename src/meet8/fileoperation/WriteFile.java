package meet8.fileoperation;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ammfat
 */
public class WriteFile {
    public static void main(String[] args) {
        final String PATH = "src/meet8/fileoperation/";
        
        String data = "This is data to write...\n"
                + "And here is the second line";
        
        System.out.println(data);
        
        try {
            var output = new FileWriter(PATH + "output/output.txt");
            
            output.write(data);
            System.out.println("Data successfully written");
            
            output.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
