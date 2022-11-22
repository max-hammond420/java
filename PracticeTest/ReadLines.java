import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadLines {

    public static void readLongLones(String filename, int length) {
        if (length < 0) {
            System.out.println("No such file");
            return;
        } 

        try {
            File f = new File(filename);
            Scanner scan = new Scanner(f);

            while (scan.hasNext()) {
                String line = scan.nextLine();
                if (line.length() > length) {
                    System.out.println(line);
                }
            }

            // Close scanner, prevents memory leaks
            scan.close();
        }  catch (FileNotFoundException e) {
            System.out.println("No such file");
            return;
        }
    }

}
