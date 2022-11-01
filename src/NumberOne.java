/*
Author @YaliHart
*/

import java.util.Scanner;

public class NumberOne {
    public static void main(String[] args) {
        System.out.println("Input Number: ");

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int num1 = number / 10;
        int num2 = number % 10;

        System.out.println("Adding both digits: " + (num1 + num2));
        System.out.println("Reverse Order: " + num2 + num1);

    }
}