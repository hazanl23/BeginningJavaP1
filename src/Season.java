import java.util.*;
/*
this program tells you what season it is depending on the day of a specific month
 */
public class Season {

    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("What month is it?");
        int month = console.nextInt();
        System.out.print("What day of the month is it?");
        int date = console.nextInt();

        if (month == 4 || month == 5 || (month == 3 && date >= 16) || (month == 6 && date <= 15)) {
            System.out.print("Spring");
        }

        else if (month == 7 || month == 8 || month == 6 || (month == 9 && date <=15)) {
            System.out.print("Summer");
        }

        else if (month == 10 || month == 11 || month == 9 || (month == 12 && date <= 15)) {
            System.out.print("Fall");
        }

        else {
            System.out.print("Winter");
        }
    }

}
