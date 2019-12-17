package com.suarez;
/*
ClassDiamondLoop uses loops to create Diamond patterns of different sizes
Lauren Hazan
12/6.2019
Version 1
 */

public class ClassDiamindLoop {
    public static final int Size = 6;

    public static void main(String[] args) {
        top();
        bottom();
    }
//this method will code the top part of a diamond
    public static void top() {
        for (int line = 1; line <= Size; line++) {
            for (int space = 1; space <= -line + Size + 1; space++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int spacebetween = 1; spacebetween <= 2 * line - 2; spacebetween++) {
                System.out.print(" ");
            }
            System.out.println("\\");
        }
    }
//this method will code the bottom part of a diamond
    public static void bottom() {
        for (int line = 1; line <= Size; line++) {
            for (int space = 1; space <= line; space++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int spacebetween = 1; spacebetween <= -2*line+2*Size; spacebetween++) {
                System.out.print(" ");
            }
            System.out.println("/");
        }
    }
}
