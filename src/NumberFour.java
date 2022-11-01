/*
Author @YaliHart
*/

import java.util.Scanner;

public class NumberFour {
    public static void main(String[] args) {
        System.out.println("How many people will be attending?");
        Scanner peopleInput = new Scanner(System.in);
        int numberPeople = peopleInput.nextInt();

        System.out.println("How many people can sit at each table?");
        Scanner tableInput = new Scanner(System.in);
        int tableSpace = peopleInput.nextInt();

        int numTables = numberPeople / tableSpace;
        int tableRemainder = numTables % 10;
        if (tableRemainder > 0) {
            ++numTables;
            System.out.println("An additonal table will be needed to seat " + tableRemainder + " people");

        }
        System.out.println("Tables Needed for " +numberPeople+" people: "+numTables);

    }
}
