import java.util.Scanner;

/**
 * Created by Nathan_Zeplowitz on 4/11/15.
 */
public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = in.nextInt();
        for (int row = 1; row <= n; row++) {
            String line = "";
            for (int spaces = 0; spaces < n - row; spaces++)
                line += " ";
            for (int stars = 1; stars < row * 2; stars++)
                line += "*";
            System.out.println(line);
        }

    }

}
