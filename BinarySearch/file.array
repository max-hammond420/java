import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;


public class BinarySearch {
	
	public static int[] readFile(String filename) {
        int[] nums;

        try {
            File f = new File(filename);
            Scanner sc = new Scanner(f);

            String line = sc.nextLine();

            String[] numsStr = line.split(" ");

            nums = new int[numsStr.length];

            // iterate over a string array and convert to num array
            int i = 0;
            for (String num : numsStr) {
                nums[i++] = Integer.parseInt(num);
            }
            // System.out.println(Arrays.toString(nums));

            sc.close();
        } catch (FileNotFoundException e) { // Error handling for file not found
            e.printStackTrace();
            return null;
        }
        // System.out.println(nums);

        return nums;
	}
	
	public static Integer binarySearch(int low, int high, int search, int[] array) {
        int mid = (low + high)/2;
        
        if (low > high) {
            return null;
        }

        if (array[mid] == search) {
            Integer value = Integer.valueOf(mid);
            return value;
        }
        else if (array[mid] < search) {
            return binarySearch(mid+1, high, search, array);
        }
        else {
            return binarySearch(low, mid, search, array);
        }
	}
	
	public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Incorrect usage: java BinarySeaerch.java <num> <file>");
        }

        int toFind = Integer.parseInt(args[0]);
        String f = args[1];

	    int[] nums = readFile(f);

        int low = 0;
        int high = nums.length - 1;


        System.out.println(binarySearch(low, high, toFind, nums));
	}
}
