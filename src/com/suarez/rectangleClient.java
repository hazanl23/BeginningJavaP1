package com.suarez;

public class rectangleClient {
    public static void main(String[] args) {
        //rectangle.Box();
        int size = rectangleClass.Box();
        System.out.println();
        pointClass p1 = new pointClass(); p1.randompoint(size);
        pointClass p2 = new pointClass(); p2.randompoint(size);
        pointClass p3 = new pointClass(); p3.randompoint(size);
        pointClass p4 = new pointClass(); p4.randompoint(size);

        rectangleClass.BoxBox(size, p1, p2, p3, p4);
        System.out.println("(" + p1.GetX() + "," + p1.GetY() + ")");
        System.out.println("(" + p2.GetX() + "," + p2.GetY() + ")");
        System.out.println("(" + p3.GetX() + "," + p3.GetY() + ")");
        System.out.println("(" + p4.GetX() + "," + p4.GetY() + ")");

        System.out.print(p1.GetX() + "," +p1.GetY());
    }
}
