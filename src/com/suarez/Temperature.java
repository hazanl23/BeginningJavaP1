package com.suarez;
import java.util.*;

public class Temperature {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print ("What is the weather today?");
        int mainweather = console.nextInt();
        for(int i = mainweather; i <= mainweather+5; i++){
            System.out.printf("%7.2f\n", (i-32)/1.8);
        }
    }
    // index 012345678901
    String s1 = "Nate Stitt";
    String s2 = "Maya Harrington";

   //need help now because mine was not working - it was turning red

}