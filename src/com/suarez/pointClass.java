package com.suarez;
import java.util.*;

public class pointClass {
    private int x;
    private int y;

    public pointClass() {
        x = 0;
        y = 1;
    }

    public pointClass(int x1, int y1){
            if (x1 >= 0) {
                x = x1;
            } else {
                System.err.println("Sorry, no negative values allowed.");
            }
            y = y1;
        }
        public void SetX ( int x1){
            x = x1;
        }
        public void SetY ( int y1){
            y = y1;
        }
        public int GetX () {
            return x;
        }
        public int GetY () {
            return y;
        }

        public void location ( int x1, int y1){
            x = x1;
            y = y1;
        }
        public double distance () {
            return Math.sqrt(x * x + y * y);
        }
        public double distance (pointClass p){
            double x2 = p.x;
            double y2 = p.y;
            return Math.sqrt(Math.pow((x - x2), 2) + Math.pow((y - y2), 2));
        }
        public void transX ( int x1, int a){
            x = x1 + a;
        }
        public void transY ( int y1, int b){
            y = y1 + b;
        }
        public void transXY ( int x1, int a, int y1, int b){
            x = x1 + x;
            y = y1 + y;
        }

        public void randompoint(int size){
        Random rand = new Random();
        int Xrand = rand.nextInt(size) + 1;
        int Yrand = rand.nextInt(size) + 1;
        x = Xrand;
        y = Yrand;
        }

       public void setX(int x1) {
        x = x1;
       }

       public void setY(int y1) {
        y = y1;
       }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

}
