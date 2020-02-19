package com.suarez;
import java.util.*;
import java.io.*;
public class pollVotes {
    public static void main(String args[]) throws FileNotFoundException {

        Scanner input = new Scanner(new File("/Users/laurenhazan/IdeaProjects/Beginning Java P1/src/com/suarez/poll.txt"));
        int obama = 0;
        int mccain = 0;

        while (input.hasNextLine()) {
            String line = input.nextLine();

            Scanner elect = new Scanner(line);
            int count = 1;
            while (elect.hasNext()) {
                while (elect.hasNextInt()) {

                    if (count == 1) {
                        obama = obama + elect.nextInt();
                    } else if (count == 2) {
                        mccain = mccain + elect.nextInt();
                    } else {
                        String booboo = elect.next();
                    }
                    count++;
                }
                    String text = elect.next();
            }
        }
        System.out.println("Obama: " + obama);
        System.out.println("Mccain: " + mccain);
    }
}

