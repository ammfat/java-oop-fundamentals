package meet8.fileoperation;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ammfat
 */
public class ReadFile {
    public static void main(String[] args) {
        final String PATH = "src/meet8/fileoperation/";
        char[] text = new char[100];
        
        try {
            var input = new FileReader(PATH + "data/input.txt");
            
            input.read(text);
            
            System.out.println("Data in the file:");
            System.out.println(text);
            
            input.close();
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}
