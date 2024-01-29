import java.util.Scanner;

public class AddressCalculation {

    //public static int dimensions;
    
    // public static int[] array = new int[dimensions];
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
        try{
        for(int i = 0; i < dimensions; i++) {
            for(int j = 1; j <= dimensions;j++) {
                address[i] *= upperBounds[j];
                address[i] += address[j];
                System.out.println(B+w*(address[i])); //print the calculated answer outside of this scope?
            }
        } //error exception out of bounds
            
        } catch(IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}