/*
Author @YaliHart
*/

import java.util.Scanner;

public class NumberSix {
    public static void main(String[] args) {
        System.out.println("How many minutes?");
        Scanner input = new Scanner(System.in);
        int minInput = input.nextInt();

        int hours = minInput / 60;
        int mins = minInput % 60;

        System.out.println(hours + " hour");
        System.out.println(mins + " minutes");


    }
}
