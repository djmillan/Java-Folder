import java.util.Scanner;
import java.util.Stack;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose a System [1] Stack [2] Queue: ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                stack();
                break;
            case 2:
                // Implement Queues method
                break;
            default:
                System.out.println("Invalid Input. Please Try again");
                break;
        }
    }

    public static void stack() {
        Scanner scanner = new Scanner(System.in);
        Stack<Object> stack = new Stack<>();
        System.out.print("What is the max space of the array?: ");
        int maxSpace = scanner.nextInt();

        while (true) {
            System.out.println("What should I do?");
            System.out.println("[1] Push\n [2] Pop\n [3] Search\n \n[4] Exit");
            System.out.print("Enter a Command here >> ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (stack.size() < maxSpace) {
                        System.out.print("Enter a value to push: ");
                        scanner.nextLine(); // Consume newline
                        String input = scanner.nextLine();
                        try {
                            int intValue = Integer.parseInt(input);
                            stack.push(intValue);
                            System.out.println("Integer value " + intValue + " pushed into the stack.");
                        } catch (NumberFormatException e) {
                            stack.push(input);
                            System.out.println("String value " + input + " pushed into the stack.");
                        }
                    } else {
                        System.out.println("The stack is already full");
                    }
                    break;

                case 2:
                    if (!stack.isEmpty()) {
                        Object poppedValue = stack.pop();
                        System.out.println("Popped value: " + poppedValue);
                    } else {
                        System.out.println("The stack is empty.");
                    }
                    break;

                case 3:
                    System.out.println("Stack contents: " + stack);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Command. Please Try Again!");
                    break;
            }
        }
    }
}