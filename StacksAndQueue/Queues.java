package StacksAndQueue;

import java.text.MessageFormat;
import java.util.*;

public class Queues {
    public static void Queues() {
        Scanner scan = new Scanner(System.in);
        Queue<Object> queue = new LinkedList<>();
        int maxUpperBounds = scan.nextInt();

        while(true) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Choose from the following:\n");
            String[] optionStrings = {",[1]Enqueue,[2]Dequeue,[3]Peek,[4]Output,[5]Exit"};
            for(String elemString : optionStrings){
                System.out.print(elemString.replace(",","        "));
            }
            System.out.print("\nType in your option >> ");
            int option = scan.nextInt();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            switch(option) {
                case 1:
                    if(queue.size() < maxUpperBounds) {
                        System.out.print("Add value >> ");
                        scan.nextLine();
                        String elementValue = scan.nextLine();
                    try {
                        int storedValue = Integer.parseInt(elementValue);
                        queue.add(storedValue);
                        String result = MessageFormat.format("Pushed Integer value: {0}",storedValue);
                        System.out.println(result);
                    } catch (NumberFormatException e) {
                        queue.add(elementValue);
                        String result = MessageFormat.format("Pushed String value: {0}",elementValue);
                        System.out.println(result);
                        }
                    } else {
                        System.out.println("The Queue has reached the maximum storage.");
                    }
                    break;
                case 2:
                    if(!queue.isEmpty()) {
                        Object dequeuObject = queue.remove();
                        System.out.println("Dequeue value: "+dequeuObject);
                    } else {
                        System.out.println("Queue has reached to null.");
                    } break;
                case 3:
                    try {
                        System.out.println("Initial Queue: "+queue);
                        System.out.println("The first element is: "+queue.peek());
                    } catch(EmptyStackException e) {
                        System.out.println(e+"\tPush a value first, before using this option.");
                    } break;
                case 4:
                    try {
                        System.out.println("Initial Queue: "+queue);
                    } catch(EmptyStackException e) {
                        System.out.println(e+"\t Enqueue a value first, before running this option.");
                    } break;
                case 5:
                    StacksAndQueues stacksAndQueues = new StacksAndQueues();
                    System.out.println("Yo! Feel free to choose an option!");
                    stacksAndQueues.menu();
                    break;
                default:
                    System.out.println("Invalid commando!");
                    break;
            }
        }

    }
}
