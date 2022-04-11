package meet8.fileoperation;

import java.io.File;

/**
 *
 * @author ammfat
 */
public class CreateFile {
    public static void main(String[] args) {
        final String PATH = "src/meet8/fileoperation/";
        
        var file = new File(PATH + "output/createFile.txt");
        
        try {            
            if (file.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("File already exists.");
            }
            
        } catch (Exception e) {
            e.getMessage();
        }
        
        System.out.println(file.canWrite());
        System.out.println(file.canRead());
        System.out.println(file.canExecute());
    }
}
