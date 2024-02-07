package StacksAndQueue;

import java.text.MessageFormat;
import java.util.*;

public class Stacks {
    
    public static void Stacks() {

        Scanner scan = new Scanner(System.in);
        Stack<Object> stacks = new Stack<>();
        System.out.print("Max TOP >> ");
        int top = scan.nextInt();
        while(true) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Choose an option from the following:\n");
            String[] optioStrings = {",[1]Push,[2]Pop,[3]Peek,[4]Search,[5]Exit"};
            for(String elemString : optioStrings){
                System.out.print(elemString.replace(",","        "));
            }
            System.out.print("\nEnter your option >> ");
            int option = scan.nextInt();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            if(option == 1) {
                if(stacks.size() < top) {
                    System.out.print("Push value >> ");
                    scan.nextLine();
                    String input = scan.nextLine();
                    try {
                        int userInput = Integer.parseInt(input);
                        stacks.push(userInput);
                        String result = MessageFormat.format("Pushed Integer value: {0}",userInput);
                        System.out.println(result);
                    } catch (NumberFormatException e) {
                        stacks.push(input);
                        String result = MessageFormat.format("Pushed String value: {0}",input);
                        System.out.println(result);
                    } 
                } else {
                    System.out.println("Stack is FULL.");
                }
                continue;
            } else if(option == 2) {
                if(!stacks.isEmpty()) {
                    Object popObject = stacks.pop();
                    System.out.println("Popped value: "+ popObject);
                } else {
                    System.out.println("Stack is EMPTY.");
                }
            } else if(option == 3) {
                try {
                    System.out.println("Initial Stacks: "+stacks);
                    System.out.println("The last element is: "+stacks.peek());
                } catch(EmptyStackException e) {
                    System.out.println("At the moment this seems to be: "+e);
                    continue;
                }
            } else if(option == 4) {
                try {
                    System.out.println("Initial Stacks: "+stacks);
                    System.out.print("Enter your search >> ");
                    int input = scan.nextInt();
                    Object seaObject = stacks.search(input);
                    if(stacks.search(input) == -1) {
                        System.out.println("The stack does not contain: "+seaObject);
                    } else {
                        System.out.println("The stack contains: "+seaObject+"\nSearched element value: "+seaObject);
                    }
                } catch(EmptyStackException e) {
                    System.out.println("Similarly this experience: "+e);
                    continue;
                }
            } else if(option == 5) {
                StacksAndQueues stacksAndQueues = new StacksAndQueues();
                System.out.println("Welcome back! What do you want to do today?");
                stacksAndQueues.menu();
            } else {
                System.out.println("Seems like you input something invalid. Please try again.");
                continue;
            }
        }
    }
}