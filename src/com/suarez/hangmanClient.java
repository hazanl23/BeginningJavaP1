package com.suarez;

import java.util.Scanner;
import java.util.Random;

//this will let the player choose if they want to play hangman
public class hangmanClient {
    Scanner console = new Scanner(System.in);

//    this part of the code is from https://gist.github.com/SedaKunda/79e1d9ddc798aec3a366919f0c14a078
    private static String word = hangmanClass.words[(int) (Math.random() * hangmanClass.words.length)];
    private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
    private static int count = 0;

    //this allows the player to guess the letters of the missing word
    public static void main(String[] args) {
        Scanner guessingWord = new Scanner(System.in);
        while (count < 7 && asterisk.contains("*")) {
            System.out.println("Guess any letter in the word");
            System.out.println(asterisk);
            String guess = guessingWord.next();
            hang(guess);
        }
        guessingWord.close();
    }

    public static void hang(String guess) {
        String newasterisk = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newasterisk += guess.charAt(0);
            } else if (asterisk.charAt(i) != '*') {
                newasterisk += word.charAt(i);
            } else {
                newasterisk += "*";
            }

            //this will print the * instead of the letters (temporarily)
        }
        if (asterisk.equals(newasterisk)) {
            count++;
        } else {
            asterisk = newasterisk;
        }

        // starting here, this will print the different parts of the hangman depending on if the player guessed the letter correctly or not
        if (count == 1) {
            hangmanClass.bar();
        }
        if (count == 2){
            hangmanClass.head();
        }
        if (count == 3) {
            hangmanClass.body();
        }
        if (count == 4) {
            hangmanClass.RightArm();
        }
        if (count == 5) {
            hangmanClass.LeftArm();
        }
        if (count == 6) {
            hangmanClass.RightLeg();
        }
        if (count == 7) {
            hangmanClass.LeftLeg();
            hangmanClass.loser();
            System.out.println("The word was " + word + ".");
        }


        //this will let the player know they have won if they guess all the letter in time
        if (asterisk.equals(word)) {
            hangmanClass.winner();
        }
    }
}

