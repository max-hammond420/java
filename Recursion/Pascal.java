import java.util.ArrayList;;


public class Pascal {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Incorrect amount of args");
            System.exit(1);
        }
        Integer rows = Integer.parseInt(args[0]);
        outputTriangle(rows);
    }

    public static void outputTriangle(int n) {
        for (int i = 0; i < n+1; i++) {
            System.out.println(calculateRow(i).toString());
        }
    }

    public static ArrayList<Integer> calculateRow(int n) {
        ArrayList<Integer> row = new ArrayList<>();
        if (n == 0) {
            row.add(1);
            return row;
        }
        else if (n == 1) {
            row.add(1);
            row.add(1);
            return row;
        }
        else {
            row.add(1);
            for (int i = 0; i < n-1; i++) {
                row.add(calculateRow(n-1).get(i) + calculateRow(n-1).get(i+1));
            }
            row.add(1);
            return row;
        }
    }
}
