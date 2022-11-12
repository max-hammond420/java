import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Works similarly to the paste command
*/
public class StickyTape {

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

    public static String[] append(String[] arr1, String[] arr2) {
        // returns a string array of both appended by tabs

        String[] newArr = new String[0];


        int len;

        if (arr1.length > arr2.length) {
            len = arr1.length;
        } else {
            len = arr2.length;
        }

        for (int i = 0; i < len; i++) {
            if (i >= arr1.length) {
                newArr = Arrays.copyOf(newArr, newArr.length+1);
                newArr[i] = '\t' + arr2[i];
            } else if (i >= arr2.length) {
                newArr = Arrays.copyOf(newArr, newArr.length+1);
                newArr[i] = arr1[i] + '\t';
            } else {
                newArr = Arrays.copyOf(newArr, newArr.length+1);
                newArr[i] = arr1[i] + '\t' + arr2[i];
            }
        }


        return newArr;
    }

    public static void main(String[] args) {

        String[] words;
        String[] newWords;

        if (args.length == 0) {
            System.out.println("Incorrect usage: java StickyTape <words1.txt> ...");
            System.exit(0);
        }

        words = readFile(args[0]); 

        for (int i = 1; i < args.length; i++) {
            newWords = readFile(args[i]);
            words = append(words, newWords);
        }

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
