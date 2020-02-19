package com.suarez;

public class ChristmasTree {
    public static final int Size = 6;

    public static void main(String[] args) {
        for(int spaces = 1; spaces <= Size + 3; spaces++){
            System.out.print(" ");
        }
        System.out.println("*");
        for(int tier = 1; tier <= 3; tier++) {
            for (int line = 1; line <= -line + Size; line++) {
                System.out.print("/");
                for (int space = 1; space <= -line + Size +3; space++){
                    System.out.print(" ");
                }
            }
        }
    }
}