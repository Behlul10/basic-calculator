package com.pluralsight;

import java.util.Scanner; //Import the scanner class for inputs

/**
 * A basic calculator that only performs Addition, Subtraction, Multiplication, and Division
 * @author Behlul Vardal
 */
public class BasicCalculator {
    public static void main(String[] args) {
        //starting the scanner early on top since the whole program needs input
        Scanner scanner = new Scanner(System.in);
        int result; //Declaring result variable so that I don't have to initialize it with every if statement


        System.out.print("Enter your first number: ");
        int num1 = scanner.nextInt(); //our numbers an Integer
        scanner.nextLine(); // consume leftover newline

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        System.out.print(
                """
                Possible calculations:
                (A)dd
                (S)ubtract
                (M)ultiply
                (D)ivide
                """
        );

        System.out.print("Please Select an Option: ");
        //Forcing input to be a character type because we only need one character
        // taking the first letter from the string input
        //making the character lowercase for case sensitivity
        char multiChoice = scanner.nextLine().toLowerCase().charAt(0); //our chouce is a string/character

        //checking which choice the user selected
        if(multiChoice == 'a') {
            result = num1 + num2;
        } else if(multiChoice == 's'){
            result = num1 - num2;
        } else if(multiChoice == 'm'){
            result = num1 * num2;
        } else if(multiChoice == 'd'){
            result = num1 / num2;
        } else{
            //creating an else case where user doesn't input available option and exiting from program
            System.out.print("Enter a valid choice!");
            return;
        }
        System.out.print("Your result is: " + result);
    }
}
