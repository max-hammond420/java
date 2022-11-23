import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class NForce {

    public static int getHeight() {

        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter height: ");
        int height = scan.nextInt();

        scan.close();

        return height;


    }

    public static void drawTriangle(int height) {

        height = height * 2;
        for (int i = 0; i < height; i++) {
            int spaces = height - i;

            StringBuilder leftPadding = new StringBuilder(spaces);
            for (int j = 0; j < spaces; j++) {
                leftPadding.append(" ");
            }
            String s = leftPadding.toString();

            s = s + "/";

            StringBuilder middlePadding = new StringBuilder(i*2);
            for (int k = 1; k <= i*2; k++) {
                if (i+1 == height/2) {
                    middlePadding.append("-");
                }
                else {
                    middlePadding.append(" ");
                }
            }
            String t = middlePadding.toString();

            s = s + t + "\\" + leftPadding;
            System.out.println(s + i + height);
        }
    }

    public static void main(String[] args) {

        int height = getHeight();

        drawTriangle(height);
    }
}
