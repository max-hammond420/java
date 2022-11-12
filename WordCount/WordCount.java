import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Works similarly to the wc command
*/

public class WordCount {

    public static String[] readFile(String filename) {

        String[] lines = new String[0];

        try {
            File f = new File(filename);
            Scanner sc = new Scanner(f);

            int i = 0;
            while (sc.hasNextLine()) {
                lines = Arrays.copyOf(lines, lines.length+1);
                lines[i++] = sc.nextLine();
            }

            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }

        return lines;
    }

    public static int getLines(String[] arr) {
        return arr.length;
    } 

    public static int getWords(String[] arr) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            String[] tmp = arr[i].split(" ");
            total += tmp.length;
        }

        return total;
    }

    public static int getCharacters(String[] arr) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i].length() + 1;
        }

        return total;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Incorrect usage: Java WordCount.java <file.txt>");
            System.exit(1);
        }

        String[] lines = readFile(args[0]);

        int lineCount = getLines(lines);
        int wordCount = getWords(lines);
        int characterCount = getCharacters(lines);

        System.out.println(lineCount + " " + wordCount + " " + characterCount);
    }
}
