package com.suarez;

public class ExclamationDiamond {
    /*
    this class creates designs with exclamation points and back slashes/forward slashes
    Lauren Hazan
    12/9/2019
    Version 1
     */

    public static int Size = 8;

    public static void main(String[] args) {
        System.out.println();
        bottom();
    }

    public static void bottom() {
        for (int line = 1; line <= Size - 1; line++) {
            for (int space = 1; space <= line -1; space++)
            {
                System.out.print("\\");
            }
            for (int spacebetween = -1; spacebetween <= -2*line+2*Size; spacebetween++)
            {
                System.out.print("!");
            }
            for (int space = 1; space <= line - 1; space++)
            {
                System.out.print("/");
            }
            System.out.println();
        }

    }
}