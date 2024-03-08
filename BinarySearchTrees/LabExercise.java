package BinarySearchTrees;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.MessageFormat;

public class LabExercise {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lab Exercise #5");
        ArrayList<Integer> binarySearchTrees = new ArrayList<Integer>();

        while(true) {
            String[] optionsOfStrings = {",[1]Add,[2]Get,[3]Set,[4]Remove,[5]Size"};
            for(String elementString : optionsOfStrings) {
                System.out.println(elementString.replace(",", "     "));
            }
            System.out.print("Choose an option >> ");
            int option = scan.nextInt();

            switch(option) {
                case 1:
                    System.out.print("Enter the integer >> ");
                    int yourNum = scan.nextInt();
                    while(true) {
                        if(yourNum != 0) {
                            binarySearchTrees.add(yourNum);
                            String result = MessageFormat.format("Added Integer value: {0}", yourNum);
                            System.out.println(result);
                            System.out.println("Binary Search Tree: "+binarySearchTrees);
                            break;
                        } else {
                            System.out.println("The value that you have entered is not allowed.");
                            String[] userOptions = {",[1]Try again,[2]Exit"};
                            for(String elementString : userOptions) {
                                System.out.println(elementString.replace(",", "     "));
                            }
                            System.out.print("Enter your option >> ");
                            int userOption = scan.nextInt();
                            if(userOption == 1) {
                                continue;
                            } else {
                                System.out.println("You chose to exit.");
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter the index you would like to get >> ");
                    int yourIndex = scan.nextInt();
                    System.out.println("Get: "+ binarySearchTrees.get(yourIndex));
                    break;
                case 3:
                    System.out.println(binarySearchTrees);
                    System.out.print("Enter what you would like to set >> ");
                    int setValue = scan.nextInt();
                    System.out.print("Enter the index >> ");
                    int setIndex = scan.nextInt();
                    System.out.println("you have set"+binarySearchTrees.set(setIndex, setValue));
                    break;
                case 4:
                    System.out.println("Enter the value to remove >> ");
                    int removeValueAt = scan.nextInt();
                    System.out.println("Initial values: "+binarySearchTrees);
                    binarySearchTrees.remove(removeValueAt);
                    String output = MessageFormat.format("Has removed: {0}", removeValueAt);
                    System.out.println(output);
                    System.out.println("Updated values: "+binarySearchTrees);
                    break;
                case 5:
                System.out.println(binarySearchTrees.size());
                    break;
                default:
                    System.out.println("This shouldn't run");

            }
        }


    }
}