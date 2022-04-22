/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatorapp;

import java.util.Scanner;

/**
 * This is a simple calculator App using Switch method (Task 3 OOP in Java
 * @Mutya Mustafa
 */
public class CalculatorApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Insert Scanner to read input
        Scanner keyboardInput = new Scanner(System.in);
        
        // Asking input 
        System.out.print("Enter a number: ");
        double num1 = keyboardInput.nextDouble();
        
        System.out.print("Choose an operator:\n 1. Addition (+) \n 2. Multiplication (x) \n 3. Subtraction \n");
         
        System.out.print("Enter an operator: ");
        char op = keyboardInput.next().charAt(0);
        
        System.out.print("Enter another number: ");
        double num2 = keyboardInput.nextDouble();
        
        //Showing result of the arithmethic operation
        switch(op) {
            case '1' :
                double result = num1 + num2;
                System.out.println(result);
                break;
            case '2' :
                result = num1 * num2;
                System.out.println(result);
                break;
            case '3' :
                result = num1 - num2;
                System.out.println(result);
                break;
            default :
                System.out.println("Invalid Operator");         
        }
        
    }
    
}
