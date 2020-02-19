import java.util.*;
/*
This program will run a specific program based on your choice
 */
public class WhichProgram {

    public static void main(String[] args) {
        boolean gameplay = true;
        while (gameplay) {
            boolean valid = true;
            Scanner console = new Scanner(System.in);
            System.out.println("\n");
            System.out.println("Type of programs:");
            System.out.println(" 1 for xo");
            System.out.println(" 2 for smallestLargest");
            System.out.println(" 3 for printGPA ");
            System.out.println(" 4 for longestName");
            System.out.println(" 5 for printTriangleType");
            System.out.println(" 6 for diceRoll");
            System.out.println(" 7 for sortingNumbers");
            System.out.println(" 0 to exit the program");
            System.out.println("Which program would you like to run?");
            int programnumber = console.nextInt();

            if (programnumber == 1) {
                xo();
            } else if (programnumber == 2) {
                smallestLargest();
            } else if (programnumber == 3) {
                printGPA();
            } else if (programnumber == 4) {
                longestName();
            } else if (programnumber == 5) {
                printTriangleType();
            } else if (programnumber == 6) {
                diceRoll();
            } else if (programnumber == 7) {
                sortingNumbers();
            } else if (programnumber == 0) {
                gameplay = false;
                System.out.print("Thanks for playing!");
            } else {
                System.out.print("ERROR");
                valid = false;
            }
            if (valid) {

            }
        }
    }

    //This program will accept an integer and print a square with an X and O pattern
    public static void xo() {
        Scanner console = new Scanner(System.in);
        System.out.println("What side length of the square would you like?");
        int size = console.nextInt();
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= size; column++) {
                if (row == column || row + column == size + 1) {
                    System.out.print("x");
                } else {
                    System.out.print("o");
                }
            }
            System.out.println();
        }
    }

    //This program will identify the smallest and largest numbers in a given set of integers
    public static void smallestLargest() {
        Scanner console = new Scanner(System.in);
        int min = 1000;
        int max = 0;
        System.out.println("How many integers would you like to enter?");
        int numbers = console.nextInt();
        int intArray[] = new int[numbers];
        for (int Num = 1; Num <= numbers; Num++) {
            System.out.println("Number " + Num + ":");
            intArray[Num - 1] = console.nextInt();
        }
        for (int Num = 1; Num <= numbers; Num++) {

            if (min >= intArray[Num - 1]) {
                min = intArray[Num - 1];
            }
            if (max <= intArray[Num - 1]) {
                max = intArray[Num - 1];
            }
        }
        System.out.println("Smallest = " + min);
        System.out.println("Largest = " + max);
    }

    //This program will calculate a GPA by taking the average of grades
    public static void printGPA() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a student record: ");
        String name = console.next();
        int number = console.nextInt();
        double sum = 0.0;
        for (int score = 0; score <= number - 1; score++) {
            int scores = console.nextInt();
            sum = sum + scores;
        }
        double average = sum / number;
        System.out.print(name + "'s grade is ");
        System.out.printf("%.2f", average);
    }

    //This program will will identify the longest name in a given set of names
    public static void longestName() {
        Scanner console = new Scanner(System.in);
        String longest = "";
        boolean tie = false;
        System.out.print("How many names would you like to print?");
        int numbernames = console.nextInt();
        for (int name = 1; name <= numbernames; name++) {
            System.out.print("name #" + name + ":");
            String namename = console.next();
            if (namename.length() == longest.length()) {
                tie = true;
            } else if (namename.length() > longest.length()) {
                tie = false;
                longest = namename;
            } else {
                tie = false;
            }
        }
        String capitalized = longest.substring(0, 1).toUpperCase() + longest.substring(1).toLowerCase();

        if (tie == true) {
            System.out.print("The names are equal in length");
        } else {
            System.out.println(capitalized + "'s name is longest");
        }
    }

    //This program will identify a certain type of triangle based on its side lengths
    public static void printTriangleType() {
        Scanner console = new Scanner(System.in);
        System.out.print("Choose the lengths of the 3 sides of the triangle");
        int side1 = console.nextInt();
        int side2 = console.nextInt();
        int side3 = console.nextInt();
        System.out.print("printTriangleType(" + side1 + "," + side2 + "," + side3 + ")");
        if (side1 == side2 && side2 == side3) {
            System.out.print("equilateral");
        } else if ((side1 == side2 && side2 != side3) || (side2 == side3 && side3 != side1) || (side1 == side3 && side3 != side2)) {
            System.out.print("isosceles");
        } else {
            System.out.print("scalene");
        }
    }

    //This program rolls dice until the sum is 7
    public static void diceRoll() {
        int sum = 0;
        Random rand = new Random();
        int counter = 0;
        while (sum != 7) {
            int a = rand.nextInt(6) + 1;
            int b = rand.nextInt(6) + 1;
            sum = a + b;
            System.out.println(a + "+" + b + "+" + "=" + (a + b));
            counter++;
        }
        System.out.println("You won after " + counter + " tries");
    }

    //This code will sort a set of numbers given into the correct order
    public static void sortingNumbers() {
        Scanner console = new Scanner(System.in);
        System.out.print("How many numbers would you like to sort?");
        int numbers = console.nextInt();
        int intArray1[] = new int[numbers];
        for (int Num = 1; Num <= numbers; Num++) {
            System.out.println("Number " + Num + ":");
            intArray1[Num - 1] = console.nextInt();
        }
        Arrays.sort(intArray1);
        System.out.printf("Sorted intArray1[] : %s", Arrays.toString(intArray1));
    }
}
