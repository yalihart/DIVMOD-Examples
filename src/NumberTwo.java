/*
Author @YaliHart
*/

import java.util.Scanner;

public class NumberTwo {
    public static void main(String[] args) {
        //Adds all 3 digits in number and reverses the order
        System.out.println("Input Number: ");

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int num1 = number / 100;
        int num2 = number % 100 / 10;
        int num3 = number % 10;

        System.out.println("Adding all digits: " + (num1 + num2 + num3));
        System.out.println("Reverse Order: " + num3 + num2 + num1);
    }
}
