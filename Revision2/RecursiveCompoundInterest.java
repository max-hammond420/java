


public class RecursiveCompoundInterest {

    public static double calculateCompoundInterest(double initialInvestment, int n) {
        // n is the amount of months

        double interest = 0;

        if (n <= 1) {
            return initialInvestment * 1.005;
        }
        else {
            interest = 1.005 * calculateCompoundInterest(initialInvestment, n-1);
        }
        return interest;
    }

    public static void main(String[] args) {

        System.out.println(calculateCompoundInterest(100, 24));

    }
}
