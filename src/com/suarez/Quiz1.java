package com.suarez;

public class Quiz1 {

    public static final int Size = 6;
    public static void main(String[] args){
        for(int line = 1; line<=Size; line++){
            stars(line);
            spaces(line);
            fslashes(line);
            bslashes(line);
            spaces(line);
            stars(line);
            System.out.println();
        }
}
public static void stars (int line){
        for(int stars = 1; stars <= -line+Size+1; stars++){
            System.out.print("*");
        }
}
    public static void spaces (int line){
        for(int spaces = 1; spaces <= line; spaces++){
            System.out.print(" ");
        }
    }
    public static void fslashes (int line){
        for(int fslashes = 1; fslashes <= -2*line+2*Size; fslashes++){
            System.out.print("/");
        }
    }
    public static void bslashes (int line){
        for(int bslashes = 1; bslashes <= 2*line-2; bslashes++){
            System.out.print("\\");
        }
    }
}

