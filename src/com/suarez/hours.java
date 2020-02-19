package com.suarez;
import java.util.*;
import java.io.*;

public class hours {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("/Users/laurenhazan/IdeaProjects/Beginning Java P1/src/com/suarez/hours.txt"));
        while (input.hasNextLine()) {
            String line = input.nextLine();

            Scanner person = new Scanner(line);
            int count = 1;
            String ID = " ";
            String name = " ";
            int size = 0;
            double sum = 0;
            while (person.hasNext()) {
                if (count == 1) {
                    ID = person.next();
                } else if (count == 2) {
                    name = person.next();
                } else {
                    while (person.hasNextDouble()) {
                        size++;
                        sum = sum + person.nextDouble();
                    }
                }
                count++;
            }
            double average = sum/size;
//            System.out.println (name + " " + "(ID#" + ID + ") worked " + sum + " hours (" + average + "hours/day)");
            System.out.print (name + "(ID#" + ID + ") worked ");
            System.out.printf ("%.1f", sum);
            System.out.print (" hours (");
            System.out.printf ("%.2f", sum/size);
            System.out.println (" hours/day");
        }
    }
}

