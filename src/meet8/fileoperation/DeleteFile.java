package meet8.fileoperation;

import java.io.File;

/**
 *
 * @author ammfat
 */
public class DeleteFile {
    public static void main(String[] args) {
        final var PATH = "src/meet8/fileoperation/";
        
        var file = new File(PATH + "data/to_delete.csv");
        
        try {
            if (file.delete()) {
                System.out.println("File deleted successfully");
            } else {
                System.out.println("Failed to delete file");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
