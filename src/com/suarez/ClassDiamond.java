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

        public static void top (){
            System.out.println("  /\\");
            System.out.println(" /  \\");
            System.out.println("/    \\");
        }

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



