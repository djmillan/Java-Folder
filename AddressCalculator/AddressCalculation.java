package AddressCalculator;
import java.util.Scanner;
/*
 * Created By: Devin Joshua S. Millan
 * Course Code & Section: CC3 - CITCS 1B Group B
 * Room & Time: M304 - 7:30-8:50
 * Date: 06/02/2024
 */

public class AddressCalculation {
    public static final String Break = "\u001B[0m";
    public static final String Black = "\u001B[30m";
    public static final String Red = "\u001B[31m";
    public static final String Green = "\u001B[32m";
    public static final String Yellow = "\u001B[33m";
    public static final String Blue = "\u001B[34m";
    public static final String Purple = "\u001B[35m";
    public static final String Cyan = "\u001B[36m";
    public static final String White = "\u001B[37m";

    public static final String BlackBG = "\u001B[40m";
    public static final String RedBG = "\u001B[41m";
    public static final String GreenBG = "\u001B[42m";
    public static final String YellowBG = "\u001B[43m";
    public static final String BlueBG = "\u001B[44m";
    public static final String PurpleBG = "\u001B[45m";
    public static final String CyanBG = "\u001B[46m";
    public static final String WhiteBG = "\u001B[47m";
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(Purple+"Welcome to the Address Calculation! - RMS\n"+Break+
        "Please choose your option:"+Red+"\n[1] 1-Dimentional\t"+Green+"[2] 2-Dimentional\t"+Blue+"[3] 3-Dimentional\t"+Cyan+"[4] Exit");
        
        while(true) {
            try {
                System.out.print(Yellow+"\nEnter your input >> ");
                int option = scan.nextInt();
                if(option == 1) {
                    System.out.println(Break+RedBG+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+BlackBG+Red+"\nYou have chosen 1-Dimentional"+Break);
                    OneDimention oneDimention = new OneDimention();
                    oneDimention.OneDimention();
                    continue;
                } else if (option == 2) {
                    System.out.println(Break+GreenBG+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+BlackBG+Green+"\nYou have chosen 2-Dimentional"+Break);
                    TwoDimention twoDimention = new TwoDimention();
                    twoDimention.TwoDimention();
                    continue;
                } else if (option == 3) {
                    System.out.println(Break+BlueBG+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+BlackBG+Blue+"\nYou have chosen 3-Dimentional"+Break);
                    ThreeDimention threeDimentional = new ThreeDimention();
                    threeDimentional.ThreeDimention();
                    continue;
                } else if (option == 4) {
                    System.out.println(Break+CyanBG+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+BlackBG+Cyan+"\nYou have chosen Exit!"+Break+"\nThank you for using the program. Have a nice day!");
                    break;
                } else {
                    System.out.println(WhiteBG+Red+"Invalid input! Try again."+Black+BlackBG);
                    continue;
                }
            } catch(Exception e) {
                System.out.println(e);
                break;
            }
        }
    }
}