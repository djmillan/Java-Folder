import java.util.Scanner;

public class AddressCalculation {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter dimensions >> ");
        int dimensions = scan.nextInt();
        int[] upperBounds = new int[dimensions];
        int count = 0;
        for(int i = 0; i < upperBounds.length;i++) {
            System.out.print("Enter #"+ ++count +" upper bound for each dimension >> ");
            int upperBound = scan.nextInt();
            upperBounds[i] += upperBound;
        }
        int[] address = new int[dimensions];
        {
            count = 0;
            for(int i = 0; i < address.length; i++) {
                System.out.print("Address #"+ ++count +" >> "); //any alternatives for counting
                int addresses = scan.nextInt();
                address[i] = addresses;
            }
        }
        System.out.print("Enter for Starting point (B) >> ");
        int B = scan.nextInt();
        System.out.print("Enter for weight (w) >> ");
        int w = scan.nextInt();
        int sum = 0;
        try{
            int k = 1;
            for(int i = 0; i < dimensions; i++) {
                for(int j = k; j < dimensions;j++) {
                    address[i] *= upperBounds[j];
                } k++;
                sum += address[i];
            }
            System.out.println(B+w*(sum));
        } catch(IndexOutOfBoundsException e) {
            System.out.println();
        }
    }
}
/*
 * Took me 2-3 days to finalize this problem, 
 * I need to improve the knack of problem solving, 
 * dividing it into chunks and having the understanding of ways to solve it.
 */