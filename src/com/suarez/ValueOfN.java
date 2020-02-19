package com.suarez;
import java.util.*;
public class ValueOfN {
    public static void main (String [] args) {
        Scanner console = new Scanner(System.in);

        System.out.print ("What value of n would you like to use?");
        int n = console.nextInt();

        double answer;

        System.out.print("1/1");

        double sum = 1.00;

        for(int i=2; i<=n; i++){
            System.out.print("+");
            System.out.print("1/" + i);
            sum = sum+1.0/i;
        }
        System.out.printf(" = %.2f", sum);
    }
}
