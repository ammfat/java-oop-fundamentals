package meet8.fileoperation;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ammfat
 */
public class WriteAppendFile {
    public static void main(String[] args) {
        final String PATH = "src/meet8/fileoperation/";

        String data = """
                      Here is APPEND
                      APPENDNDDDDDD\n""";

        System.out.println(data);

        try (var output = new FileWriter(PATH + "output/output.txt", true)) {
            output.append(data);
            System.out.println("Data successfully written");
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
