public class Recursion{

    public static double compoundInterest(double startingBalance, int months){
        double result;
        if (months <= 0)
            return startingBalance;
        else
            return 1.1 * compoundInterest(startingBalance, months-1);
    }

    public static void main(String[] args){
        System.out.println(compoundInterest(100, 2));
    }
}
