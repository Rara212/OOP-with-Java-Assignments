/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package making.half.diamond;

import java.util.Scanner;

/**
 * This is an app to make half diamond shape to implement the concept of for loop and do while
 * @Mutya Mustafa 
 */
public class MakingHalfDiamond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer;
        do{
            System.out.println("Hello! How many stars would you like to print?");
            int numOfStars = scan.nextInt();

            for(int i = 1; i <= numOfStars; i++) {
                for(int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for(int i = numOfStars - 1; i > 0; i--) {
                for(int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            System.out.println("Do you want to make another half diamond? Yes or No");
            answer = scan.next();
        }
        while (answer.equalsIgnoreCase("Yes"));
        
    }
    
}