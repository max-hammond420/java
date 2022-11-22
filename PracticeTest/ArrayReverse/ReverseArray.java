import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ReverseArray {

    public static String[] getInput(String filename) {

        try {
            File f = new File(filename);
            Scanner scan = new Scanner(f);

            String line = scan.nextLine();

            String[] lineEntries = line.split(" ");

            scan.close();

            return lineEntries;
        } catch (FileNotFoundException e) {
            return null;
        }
    }

    public static String[] reverseArray(String[] arr) {
        String[] arrOutput = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrOutput[i] = arr[arr.length-1-i];
        }
        return arrOutput;
    }

    public static void fileOutput(String[] arr, String filename) {
        try {
            FileWriter f = new FileWriter(filename);

            String[] s = reverseArray(arr);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length; i++) {
                sb.append(s[i]).append(' ');
            }
            String str = sb.substring(0, sb.length()-1);

            f.write(str+'\n');

            f.close();

        } catch (IOException e) {
            return;
        }
    }

    public static void main(String[] args) {


        fileOutput(getInput(args[0]), args[1]);

        System.out.println();
    }
}
