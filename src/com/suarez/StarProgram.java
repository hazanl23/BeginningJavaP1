package com.suarez;
/*
StarProgram is learning to make and use for loops
Lauren Hazan
12/5/2019
Version 1
 */
public class StarProgram {
    public static void main (String[]args){
        star(6,10);
    }
    public static void star(int line, int star)
    //this method will create a repeating pattern of stars
    {
        for(int i=1;i<=line; i++){
            for(int j=1; j<= star; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }


          }

