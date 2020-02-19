package com.suarez;
import java.io.File;
import java.io.IOException;
import java.util.*;



public class hangmanClass {
    //this is a string for all of the possible words for the player to have to guess in the game of Hangman
    public static String[] words = {"addition", "banana", "computer", "daughter", "early", "frequent", "great", "harmony", "impulse", "journey", "kettle","laugh", "material", "normal", "operation", "physical", "question", "relation", "shame", "theory", "umbrella", "violent", "whistle", "xylophone", "yesterday", "zebra"};




    //this will print the beginning of the game of hangman once the player says they want to play
    public static void bar() {
        System.out.println("    -------");
        System.out.println("    |     |");
        System.out.println("    |      ");
        System.out.println("    |      ");
        System.out.println("    |      ");
        System.out.println("    |      ");
        System.out.println("    |      ");
        System.out.println("    |      ");
        System.out.println(" ___________");
    }
    //this will print the head of the person
    public static void head() {
        System.out.println("    -------");
        System.out.println("    |     |");
        System.out.println("    |     o");
        System.out.println("    |      ");
        System.out.println("    |      ");
        System.out.println("    |      ");
        System.out.println("    |      ");
        System.out.println("    |      ");
        System.out.println(" ___________");
    }
    //this will print the head and body of the person
    public static void body() {
        System.out.println("    -------");
        System.out.println("    |     |");
        System.out.println("    |     o");
        System.out.println("    |     | ");
        System.out.println("    |     | ");
        System.out.println("    |      ");
        System.out.println("    |      ");
        System.out.println("    |      ");
        System.out.println(" ___________");
    }
    //this will print the head, body, and right arm of the person
    public static void RightArm() {
        System.out.println("    -------");
        System.out.println("    |     |");
        System.out.println("    |     o");
        System.out.println("    |     |/ ");
        System.out.println("    |     | ");
        System.out.println("    |      ");
        System.out.println("    |      ");
        System.out.println("    |      ");
        System.out.println(" ___________");
    }
    //this will print the head, body, right arm, and left arm of the person
    public static void LeftArm() {
        System.out.println("    -------");
        System.out.println("    |     |");
        System.out.println("    |     o");
        System.out.println("    |    \\|/ ");
        System.out.println("    |     | ");
        System.out.println("    |      ");
        System.out.println("    |      ");
        System.out.println("    |      ");
        System.out.println(" ___________");
    }
    //this will print the head, body, right arm, left arm, and right leg of the person
    public static void RightLeg() {
        System.out.println("    -------");
        System.out.println("    |     |");
        System.out.println("    |     o");
        System.out.println("    |    \\|/ ");
        System.out.println("    |     | ");
        System.out.println("    |      \\");
        System.out.println("    |      ");
        System.out.println("    |      ");
        System.out.println(" ___________");
    }
    //this will print the head, body, right arm, left arm, right leg, and left leg of the person
    public static void LeftLeg() {
        System.out.println("    -------");
        System.out.println("    |     |");
        System.out.println("    |     o");
        System.out.println("    |    \\|/ ");
        System.out.println("    |     | ");
        System.out.println("    |    / \\");
        System.out.println("    |      ");
        System.out.println("    |      ");
        System.out.println(" ___________");
    }
//this will print if the player has won
    public static void winner() {
        System.out.println("Congratulations, you guessed the word correctly!");
    }
//this will print if the player has lost
    public static void loser() {
        System.out.println("You did not guess the word in time.");

    }

    public static void end() {
        System.out.print("Thanks for playing!");
    }
}