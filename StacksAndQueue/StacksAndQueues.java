package StacksAndQueue;

import java.util.*;

public class StacksAndQueues {

    public static void menu() {
        while(true) {
            
            Scanner scan = new Scanner(System.in);
            System.out.println("Choose an option:\n\t[1] Stacks \t[2] Queues \t[3] Exit");
            int option = scan.nextInt();
            
            switch(option) {
                case 1:
                System.out.println("You have chosen Stacks!");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    Stacks stacks = new Stacks();
                    stacks.Stacks();
                    break;
                    case 2:
                    System.out.println("This is Queue");
                    break;
                    case 3:
                    System.out.println("Thank you for using my program.");
                    break;
                default:
                System.out.println("Invalid input! Please try again.");
                break;
            } if(option == 3) {
                break;
            }
        }

    }
    
    public static void main(String[] args) {
        System.out.println("Good day, Welcome to my program!");
        menu();
    }
    
}
