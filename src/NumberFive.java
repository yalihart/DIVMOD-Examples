/*
Author @YaliHart
*/

import java.util.Scanner;

public class NumberFive {
    public static void main(String[] args) {
        System.out.println("Enter Number Of Days: ");
        Scanner input = new Scanner(System.in);
        int inputDays = input.nextInt();

        int years = inputDays / 365;
        int months = inputDays % 365 / 30;
        int days = inputDays % 365 % 30;

        System.out.println(years + " year");
        System.out.println(months + " months");
        System.out.println(days + " days");
    }
}
