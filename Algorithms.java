import java.util.*;

public class Algorithms {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
    
        //My algorithm to gain strength w/o weight lifting
        
        System.out.println("At home or gym");
        System.out.println("Wear appropriate clothing");
        System.out.println("Prepare yoga mat");
        System.out.println("Decide to exercise upper or lower body");

        String decision = scan.nextLine(); //Scanner in use
        if(decision.equalsIgnoreCase("Upper")) {
            System.out.println("Start upper body warm-up");
        } else if(decision.equalsIgnoreCase("Lower")) {
            System.out.println("Start lower body warm-up");
        }
            System.out.println("Do dynamic stretching");
        for(int i = 0; i < 1;) {
            System.out.println("Does the body feel warmed up? (Yes/No)");

            String body = scan.nextLine();
            if(body.equalsIgnoreCase("Yes")) {
                System.out.println("Do the desired exercise routine");
                break;
            } else if(body.equalsIgnoreCase("No")) {
                System.out.println("Continue warming up");
                continue;
            }

        }
        System.out.println("After doing the exercise routine, cooldown");
        System.out.println("Fix yoga mat");
        System.out.println("Take a warm bath");
        System.out.println("Change clothing");
        System.out.println("Don't miss anabolic window. Eat protein.");

        int j,i;
        int counter = 0;
        int[] sort = {1,4,5,6,7,8,6,4,3,0,5,3,7};

        for(i = 0; i < sort.length;i++) {
            for(j = i + 1; j < sort.length;j++ ) {
                counter++;
            if(sort[i] == sort[j]) {
                System.out.println("Duplicate elements found!");
                break;
                }
            }
        }
        System.out.println("The time complexity is: "+counter);   
    }
}