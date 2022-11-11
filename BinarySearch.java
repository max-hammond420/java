import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinarySearch {
	
	public static int[] readFile(String filename) {
        File f = new File(filename);

        try {
            Scanner sc = new Scanner(f);

            String line = sc.nextLine();
            System.out.println(line);

            String[] str = line.split(" ");

            int[] nums = new int[str.length];

            for (int i = 0; i < str.length; i++) {
                nums[i] = Integer.parseInt(str[i]);
            }

            sc.close();

            return nums;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
	}
	
	public static Integer binarySearch(int low, int high, int search, int[] array) {
		
		return null;
	}
	
	public static void main(String[] args) {
        String f = "file.array";

        System.out.println(readFile(f));
		
	}
}
