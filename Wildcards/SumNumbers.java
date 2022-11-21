import java.util.Arrays;
import java.util.List;

public class SumNumbers {
    public static double sumNumbers(List<? extends Number> nums) {
        double sum = 0.0;
        for (int i = 0; i < nums.size(); i++) {
            sum = sum + nums.get(i).doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumNumbers(
            Arrays.asList(
            new Integer[] { 1, 2, 3, 4, 5, 6 }
            )
        ));
        System.out.println(sumNumbers(
            Arrays.asList(
            new Double[] {1.0, 5.0, -10.0, 2.0 }
            )
        ));
    }
}
