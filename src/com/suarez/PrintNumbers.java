package com.suarez;
/*
This program will print numbers from 1 to a given number
Lauren Hazan
12/4/2019
Version 1
 */
public class PrintNumbers {
    public static void main(String[] args) {
        printNum(15);
        printNum(25);
        printNum(35);
      }

        public static void printNum(int num){
            for (int count = 1; count <= num; count++){
                System.out.print("[" + count + "]");

            }
            System.out.println();
        }

    }