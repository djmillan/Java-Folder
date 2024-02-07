package StacksAndQueue;

import java.text.MessageFormat;
import java.util.*;

public class Stacks {
    
    public static void Stacks() {

        Scanner scan = new Scanner(System.in);
        Stack<Object> stack = new Stack<>();
        System.out.print("Maximum TOP >> ");
        int top = scan.nextInt();
        while(true) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Choose an option from the following:\n");
            String[] optionStrings = {",[1]Push,[2]Pop,[3]Peek,[4]Search,[5]Exit"};
            for(String elementString : optionStrings){
                System.out.print(elementString.replace(",","        "));
            }
            System.out.print("\nType in your option >> ");
            int option = scan.nextInt();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            if(option == 1) {
                if(stack.size() < top) {
                    System.out.print("Push value >> ");
                    scan.nextLine();
                    String elementValue = scan.nextLine();
                    try {
                        int storedValue = Integer.parseInt(elementValue);
                        stack.push(storedValue);
                        String result = MessageFormat.format("Pushed Integer value: {0}",storedValue);
                        System.out.println(result);
                    } catch (NumberFormatException e) {
                        stack.push(elementValue);
                        String result = MessageFormat.format("Pushed String value: {0}",elementValue);
                        System.out.println(result);
                    } 
                } else {
                    System.out.println("Stack is FULL.");
                }
            } else if(option == 2) {
                if(!stack.isEmpty()) {
                    Object popObject = stack.pop();
                    System.out.println("Popped value: "+ popObject);
                } else {
                    System.out.println("Stack is EMPTY.");
                }
            } else if(option == 3) {
                try {
                    System.out.println("Initial Stack: "+stack);
                    System.out.println("The last element is: "+stack.peek());
                } catch(EmptyStackException e) {
                    System.out.println("At the moment this seems to be: "+e+"\nYou must push values first, then you can avoid the thrown exception.");
                    continue;
                }
            } else if(option == 4) {
                try {
                    System.out.println("Initial Stack: "+stack);
                    System.out.print("Enter your search >> ");
                    int elementValue = scan.nextInt();
                    Object searchObject = stack.search(elementValue);
                    if(stack.search(elementValue) == -1) {
                        System.out.println("The Stack does not contain: "+searchObject);
                    } else {
                        System.out.println("The Stack contains: "+searchObject+"\nSearched element value: "+searchObject);
                    }
                } catch(EmptyStackException e) {
                    System.out.println("Similarly this experience: "+e+"\nMust push values, to be able to avoid the exception.");
                    continue;
                }
            } else if(option == 5) {
                StacksAndQueues stacksAndQueues = new StacksAndQueues();
                System.out.println("Welcome back! Choose an option for today!");
                stacksAndQueues.menu();
            } else {
                System.out.println("Seems like you inserted something invalid. Please try again.");
                continue;
            }
        }
    }
}