package com.testing;

import java.io.IOException;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) throws InterruptedException, IOException {
        int userAnswer;

        Scanner keyboardScanner = new Scanner(System.in);
        RandomNumber game = new RandomNumber(1, 10);

        System.out.println("Welcome to the guessing game !\n\n");
        game.printInterval();

        System.out.println("Press [Enter] to START !");
        System.in.read();


        for(int count = 1; count <= 3; count++){
            System.out.println("Starting in "+ count);
            Thread.sleep(1000);
        }

        while (true){
            game.rollNumber();
            System.out.print("\nThe computer has generated a number !\nGuess it: ");

            userAnswer = keyboardScanner.nextInt();

            if(userAnswer == game.getCurrentNumber()){
                System.out.println("You won !\n");
                System.exit(0);
            }else{
                System.out.println("Wrong ! Try Again...");
            }

        }
    }
}
