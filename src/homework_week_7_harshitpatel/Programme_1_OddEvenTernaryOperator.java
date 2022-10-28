package homework_week_7_harshitpatel;
import java.util.Scanner;

public class Programme_1_OddEvenTernaryOperator {

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public static void main(String[] args){
    //Scanner declaration for reading input from consile.
    Scanner scanner  = new Scanner(System.in);
    System.out.println("Please Enter the number : ");
    int number = scanner.nextInt();
    isItOddOrEvenNumber(number);
    //Closing the scanner object
    scanner.close();
}
//Checking the umber is even or odd
    public static void isItOddOrEvenNumber (int number) {
    //ternary operator is used
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The " + number + " is " + evenOrOdd + " number");
    }
}
