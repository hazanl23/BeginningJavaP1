package com.suarez;

public class pointClient {
    public static void main (String [] args) {
        pointClass p1 = new pointClass();
        System.out.println("(" + p1.GetX() + "," + p1.GetY() + ")");
        p1.SetX(5);
        p1.SetY(7);
        pointClass p2 = new pointClass(6, 10);
        System.out.println("(" + p2.GetX() + "," + p2.GetY() + ")");

        double distance = p1.distance();
        System.out.println("distance = " + distance);
        distance = p2.distance();
        System.out.println("distance = " + distance);
        distance = p2.distance(p1);
        System.out.println("distance = " + distance);
        p1.transX(0,3);
        System.out.println("(" + p1.GetX() + "," + p1.GetY() + ")");
        p1.transY(3,0);
        System.out.println("(" + p1.GetX() + "," + p1.GetY() + ")");
    }
}
