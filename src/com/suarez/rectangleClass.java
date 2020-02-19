package com.suarez;

import java.util.*;

public class rectangleClass {
    public static int Box() {
        Scanner console = new Scanner(System.in);
        System.out.print("What size box would you like?");
        int size = console.nextInt();

        for (int dash = 1; dash <= size + 2; dash++) {
            System.out.print("_");
        }
    System.out.println();

        for (int rows = 1; rows <= size; rows++) {
            System.out.print("|");
            for (int columns = 0; columns <= size - 2; columns++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        for (int dash = 1; dash <= size + 2; dash++) {
            System.out.print("_");
        }
        return size;
    }
    public static void BoxBox(int size, pointClass p1, pointClass p2, pointClass p3, pointClass p4){
        for(int dash = 1; dash <= size + 2; dash++){
            System.out.print("_");
        }
        System.out.println();

        for (int lines = 1; lines <= size; lines++){
            System.out.print("|");

            for (int columns = 0; columns <= size - 2; columns++){
                if (((p1.GetX() == columns && p1.GetY() == lines) || (p2.GetX() == columns && p2.GetY() == lines) || (p3.GetX() == columns && p3.GetY() == lines) || (p4.GetX() == columns && p4.GetY() == lines) )){
                   System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }
        for (int dash = 1; dash <= size + 2; dash++){
            System.out.print("_");
        }
    }
}
