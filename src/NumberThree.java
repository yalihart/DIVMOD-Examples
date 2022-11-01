/*
Author @YaliHart
*/

import java.util.Scanner;

public class NumberThree {
    public static void main(String[] args) {
        System.out.println("Input Number of Students: ");

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int numClasses = number / 30;
        int classRemainder = numClasses % 10;
        if (classRemainder != 0) {
            ++numClasses;

        }
            System.out.println("Classes Needed for " +number+" students: "+numClasses);

    }
}
