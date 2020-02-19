package com.suarez;

public class Reciept {
    public static void main (String[] args) {
        int subtotal = 38 + 40 + 30;
        double tax = 0.08 * subtotal;
        double tip = 0.15 * subtotal;
        System.out.printf("Subtotal: $%4d \n", subtotal);
        System.out.printf("Tax: $%9.2f \n", tax);
        System.out.printf("Tip: $%9.2f \n",  tip);
        System.out.printf("Total: $%7.2f \n", (tax+tip+subtotal));
    }
}
