import java.util.Scanner;
import java.util.Arrays;


public  class Search {

    public static String[] countOccurances(String keyword, String line) {
        // Finds the amount of times keyword occurs in line
        // returns a list of strings which contain the keyword,
        // if no occurances, return null
        String[] words = line.split("\\s+");

        String[] containingWords = new String[0];

        for (int i = 0; i < words.length; i++) {
            // if keyword in words[i], add to containingWords
            if (words[i].contains(keyword)) {
                containingWords = Arrays.copyOf(containingWords, containingWords.length+1);
                containingWords[containingWords.length-1] = words[i];
            }
        }

        if (containingWords.length == 0) {
            containingWords = null;
        }
        return containingWords;
    }

    public static String[] getLines() {
        Scanner sc = new Scanner(System.in);

        String[] lines = new String[0];

        int i = 0;

        while(true) {
            String nextLine = sc.nextLine();
            if ( nextLine.equals("") ) {
               break;
            }
            lines = Arrays.copyOf(lines, lines.length+1);
            lines[i] = nextLine;
            i++;
        }

        return lines;
    }

    public static String convertToReadable(String[] words) {
        // returns "in 'item1' and 'item2' and 'item3', etc"
        String s = "in " + "'" +  words[0] + "'";
        
        for (int i = 1; i < words.length; i++) {
            s = s + " and '" + words[i] + "'";
        }

        return s;
    }

    public static void main(String[] args) {
        System.out.println("Enter data:");

        String[] lines = getLines();
        
        System.out.print("Enter search term: ");
        Scanner scan = new Scanner(System.in);
        String searchTerm = scan.next();
        scan.close();

        System.out.println("");

        int nullCount = 0;
        for (int i = 0; i < lines.length; i++) {
            String[] count = countOccurances(searchTerm, lines[i]);
            int lineNum = i + 1;
            if (count != null) {
                String end = convertToReadable(count);
                System.out.println("Line " + String.valueOf(lineNum) + " contains '" + searchTerm + "' " + end);
            } else { nullCount++; }
        }
        
        if (nullCount+1 == lines.length) {
            System.out.println("Search term was not found!");
        }
    }
}
