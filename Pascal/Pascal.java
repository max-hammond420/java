import java.util.Arrays;
/*
   Print out pascal's triangle up to number arg[0]
*/

public class Pascal {

    public static long[] calculateNext(long[] prev) {
        // calculates the next array in pascal's triangle, given the previosu array is correct
        long[] next = {1};
        // System.out.println(Arrays.toString(prev));
        for (int i = 1; i < prev.length; i++) {
            // System.out.println(prev[i]);
            // System.out.println(next[i-1]);
            next = Arrays.copyOf(next, next.length+1);
            next[i] = prev[i] + prev[i-1];
        }
        next = Arrays.copyOf(next, next.length+1);
        next[next.length-1] = 1;
        return next;
        
    }

    public static void printTriangle(Integer n) {
        // prints the rows of 1 to n of pascal's triangle
        if (n == 0) {
            System.out.println(1);
            return;
        }

        if (n == 1) {
            System.out.println("1");
            System.out.println("1 1");
            return;
        }

        long[] prev = {1, 1};

        for (int i = 1; i < n+1; i++) {
            if (i == 1) {
                System.out.println(i);
                continue;
            }
            if (i == 2) {
                System.out.println(Arrays.toString(prev).replaceAll("^.|.$", "").replace(",",""));
            }
            long[] next = calculateNext(prev);
            System.out.println(Arrays.toString(next).replaceAll("^.|.$", "").replace(",",""));
            prev = next;
        }
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Not enough arguments");
            return;
        }
        else if (args.length > 1) {
            System.out.println("Too many arguments");
            return;
        }

        Integer num;

        try {
            Integer.parseInt(args[0]);
            num = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid argument.");
            return;
        }

        printTriangle(num);
    }
}
