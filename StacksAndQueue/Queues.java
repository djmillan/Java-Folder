package StacksAndQueue;

import java.util.*;

public class Queues {
    public static void Queues() {
        Scanner scan = new Scanner(System.in);
        Queue<Object> queues = new LinkedList<>();
        int maxUpperBounds = scan.nextInt();

        while(true) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Choose from the following:\n");
            String[] optionStrings = {",[1]Enqueue,[2]Dequeue,[3]Output,[4]Exit"};
            for(String elemString : optionStrings){
                System.out.print(elemString.replace(",","        "));
            }
            System.out.print("\nType in your option >> ");
            int option = scan.nextInt();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            switch(option) {
                case 1:
                    if(queues.size() < maxUpperBounds) {
                        System.out.print("Add value >> ");
                        scan.nextLine();
                        String input = scan.nextLine();
                    }
                    break;
            }
        }

    }
}
