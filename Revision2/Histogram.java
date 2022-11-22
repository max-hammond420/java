import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Histogram {

    public static ArrayList<Integer> getInput() {

        ArrayList<Integer> nums = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        while (num != -1) {
            nums.add(num);
            num = scan.nextInt();
        }
            
        scan.close();

        return nums;
    }

    public static HashMap<Integer, Integer> getRepeats(ArrayList<Integer> repeatedNums) {

        HashMap<Integer, Integer> nums = new HashMap<>();

        for (int i = 0; i < repeatedNums.size(); i++) {

            if (nums.containsKey(repeatedNums.get(i))) {
                Integer k = repeatedNums.get(i);
                Integer v = nums.get(k);
                nums.put(k, v+1);
            }
            else {
                nums.put(repeatedNums.get(i), 1);
            }
        }

        return nums;
    }
    
    public static void printRepeats(HashMap<Integer, Integer> nums) {
        for (Map.Entry<Integer, Integer> entry : nums.entrySet()) {
            Integer k = entry.getKey();
            Integer v = entry.getValue();
            if (v > 1) {
                System.out.println("The number " + k + " occurs " + v + " times.");
            }
            else if (v == 1) {
                System.out.println("The number " + k + " occurs " + v + " time.");
            }
        }
    }

    public static void main(String[] args) {
        
        HashMap<Integer, Integer> nums = getRepeats(getInput());

        printRepeats(nums);
    }
}
