package com.suarez;

import sun.lwawt.macosx.CSystemTray;

public class StarredDiamonds {
    public static final int Size = 4;

    public static void main(String[] args) {
        line();
        top();
        bottom();
        line();
        bottom();
        top();
        line();

    }
//this method creates the line that appears at the top, middle, and bottom of the pattern
    public static void line() {
        System.out.print("+");
        for (int dash = 1; dash <= 2 * Size + 1; dash++) {
            System.out.print("-");

        }
        System.out.println("+");
    }
//this method creates the top part of the diamond
    public static void top() {
        for (int line = 1; line <= Size; line++) {
            System.out.print("|");
            spaces(line);
            for (int slash = 1; slash <= line - 1; slash++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (int slash = 1; slash <= line - 1; slash++) {
                System.out.print("\\");
            }
            spaces(line);
            System.out.println("|");

        }

    }
//this method determines the number of spaces between the outer lines and the patterns inside
    public static void spaces(int line) {
        for (int space = 1; space <= -line + Size+1; space++) {
            System.out.print(" ");
        }
    }
//this method creates the bottom part of the diamond
    public static void bottom() {
        for (int line = 1; line <= Size; line++) {
            System.out.print("|");
            spaces2(line);
            for (int slash = 1; slash <= -line +Size; slash++) {
                System.out.print("\\");
            }
            System.out.print("*");
            for (int slash = 1; slash <= -line +Size; slash++) {
                System.out.print("/");
            }
            spaces2(line);
            System.out.println("|");

        }

    }

        public static void spaces2(int line){
            for (int space = 1; space <= line  ; space++) {
                System.out.print(" ");
            }
        }
    }


