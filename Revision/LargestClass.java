import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;


public class LargestClass {

    public static HashMap<String, Integer> readFile(String f) {
        File file = new File(f);
        try {
            Scanner scan = new Scanner(file);
            ArrayList<String> classes = new ArrayList<>();

            HashMap<String, Integer> classCount = new HashMap<>();

            while (scan.hasNext()) {
                String line = scan.nextLine();
                line = line.split(":")[1];
                String[] classesOnLine = line.split(",");
                for (int i = 0; i < classesOnLine.length; i++) {
                    classes.add(classesOnLine[i]);
                }

            }

            for (int i = 0; i < classes.size(); i++) {
                if (classCount.containsKey(classes.get(i))) {
                    String key = classes.get(i);
                    Integer v = classCount.get(key);
                    classCount.put(key, v+1);
                }
                else {
                    classCount.put(classes.get(i), 1);
                }
            }

            scan.close();

            return classCount;
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            e.printStackTrace();
        }
        return null;
    }

    public static String findLargest(HashMap<String, Integer> classes) {
        int currentLargest = 0;
        String largestClass = "";
        for (Map.Entry<String, Integer> entry : classes.entrySet() ) {
            Integer v = entry.getValue();
            if (v > currentLargest) {
                currentLargest = v;
                largestClass = entry.getKey();
            }
        } 

        return largestClass;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Incorrect usage, should be java largestClass.java <file>");
            System.exit(1);
        }

        String filename = args[0];

        HashMap<String, Integer> classCount = (readFile(filename));
        System.out.println(findLargest(classCount));
    }
}
