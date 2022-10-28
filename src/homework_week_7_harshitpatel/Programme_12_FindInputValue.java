package homework_week_7_harshitpatel;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Programme_12_FindInputValue {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any Character: ");
        char ch = scanner.next().charAt(0);
        //Object Creation
        Programme_12_FindInputValue inputValue = new Programme_12_FindInputValue();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);
        scanner.close();
    }

    //Find the input value is Alphabet, Digit or  Symbol
    public void checkInputValueIsAlphabetNumberOrSymbol(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an Alphabet.");
        } else if (ch >= '0' && ch <= '9') {
        System.out.println(ch + " is a Digit.");
        }else {
            System.out.println(ch + " is a Symbol.");
        }
    }
}
