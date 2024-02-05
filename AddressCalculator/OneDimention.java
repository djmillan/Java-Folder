package AddressCalculator;

import java.util.Scanner;

public class OneDimention {
    public static void OneDimention() {
    System.out.print("Please enter a starting point (B) >> ");
    Scanner scan = new Scanner(System.in);
    int B = scan.nextInt();
    System.out.print("Type the weight (w) >> ");
    int w = scan.nextInt();
    System.out.print("Your input row index (i) >> ");
    int i = scan.nextInt();
    System.out.print("Provide # of columns max (r) >> ");
    int r = scan.nextInt();
    System.out.print("Enter row index (j) >> ");
    int j = scan.nextInt();

    System.out.println(B+((i+r*j)*w));

    }
}