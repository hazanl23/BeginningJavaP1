package com.suarez;
/*
This program will calculate the area of a circle with a given radius
Lauren Hazan
12/4/2019
Version 1
 */
public class AreaofCircle {
    public static void main (String [] args) {
        final double pi=3.14;
        double area;
        double radius=4;
        area=radius*radius*pi;
        System.out.println("The area of a circle with radius of "+radius+" inches is "+area+" square inches");
    }
}
