/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessinggame;

import java.util.Scanner;

/**
 * This is a guessing game to implement the concept of while loop; (Task 3 of OOP with Java)
 * @Mutya Mustafa with reference from Mike Dane https://www.youtube.com/watch?v=sWP9VPpys-U&list=PLLAZ4kZ9dFpPpdR_9IQBUDLjYalvdrGGb&index=20
 */
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inserting scanner system to Java to read input
        Scanner keyboardInput = new Scanner(System.in);
        
        String secretWord = "Beautiful";
        String guess = "";
        int guessCount = 0;
        int guessLimit = 3;
        boolean outOfGuesses = false;
        
        System.out.println("This is a guessing game, write a synonym of 'breathtaking'");
        while(!guess.equals(secretWord) && !outOfGuesses) {
            if(guessCount < guessLimit){
            
            System.out.print("Enter a guess: ");
            guess = keyboardInput.nextLine();
            guessCount++;
            }else {
                outOfGuesses = true;
            }
        }
         if (outOfGuesses) {
             System.out.println("Oops! sorry, better luck next time. No more guesses.");
         } else {
             System.out.println("You Win!");
         }
    }  
}
