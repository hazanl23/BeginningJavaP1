package com.suarez;
    /*
    ClassDiamond shows how to create and print patterns
    Lauren Hazan
    12/2/2019
    Ver 1
    */

public class ClassDiamond {
    public static void main (String[] args){
        Diamond();
        X();
    }
//this code will print the top part of a diamond
        public static void top (){
            System.out.println("  /\\");
            System.out.println(" /  \\");
            System.out.println("/    \\");
        }
//this cide will print the bottom part of a diamond
        public static void bottom (){
            System.out.println("\\    /");
            System.out.println(" \\  /");
            System.out.println("  \\/");
        }
        public static void Diamond(){
            top();
            bottom();
        }
        public static void X(){
            bottom();
            top();
        }
    }



