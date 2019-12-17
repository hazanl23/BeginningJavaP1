package com.suarez;
/*
StarProgram is learning to make and use for loops to create different patterns
Lauren Hazan
12/5/2019
Version 1
 */
public class StarProgram2 {
    public static void main(String[] args) {
        star(6, 1);
    }

    public static void star(int line, int star)
    {
        for (int i = 1; i <= line; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
                    }
                }
            }
