import java.util.Arrays;
import java.util.List;

public class SumNumbers {

    public static double sumNumbers(List<? extends Number> numbers) {
        double result = 0.0;
        for(Number n : numbers) {
            result += n.doubleValue();
        }
        return result;
    }
    
    
    public static void main(String[] args) {
        System.out.println(sumNumbers(
            Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6 })));
        System.out.println(sumNumbers(
            Arrays.asList(new Double[] {1.0, 5.0, -10.0, 2.0 })));
    }
}
