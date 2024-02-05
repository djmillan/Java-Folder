package AddressCalculator;

import java.util.Scanner;

public class TwoDimention {
    public static void TwoDimention() {
        Scanner scan = new Scanner(System.in);
        try{
        System.out.print("Kindly input the dimensions >> ");
        int dimensions = scan.nextInt();
        int[] upperBounds = new int[dimensions];
        int count = 0;
        for(int i = 0; i < upperBounds.length;i++) {
            System.out.print("Provide each dimension #"+ (++count) +" upper bound >> ");
            int upperBound = scan.nextInt();
            upperBounds[i] += upperBound;
        }
        int[] address = new int[dimensions];
        {
            count = 0;
                for(int i = 0; i < address.length; i++) {
                    System.out.print("To proceed, input #"+ (++count) +" address >> "); //any alternatives for counting
                    int addresses = scan.nextInt();
                    address[i] = addresses;
                }
        }
        System.out.print("Your input for Starting point (B) >> ");
        int B = scan.nextInt();
        System.out.print("Please enter the weight (w) >> ");
        int w = scan.nextInt();
        int sum = 0;
            int k = 1;
            for(int i = 0; i < dimensions; i++) {
                for(int j = k; j < dimensions;j++) {
                    address[i] *= upperBounds[j];
                } k++;
                sum += address[i];
            }
            System.out.print("The computated answer is: ");
            System.out.print(B+((sum)*w)); //How can I create a method for B and w to return and so this line could read it and I can use the method to call it on the other class?
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
