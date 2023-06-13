package project_1;

public class Task3 {
    public static void main(String[] args) {
        /*
        Write a Java program that will add up the value
        of a number of quarters, dimes, nickels, and pennies.
        example:
        quarters = 5
        Dimes = 4
        Nickels = 3
        Pennies = 2

        this will represent $1.82

        1 quarter = 0.25-->25
        1 dime = 0.10-->10
        1 nickel = 0.05-->5
        1 penny = 0.01-->1
        */

        int numberOfQuarters=5;
        int numberOfDimes=4;
        int numberOfNickels=3;
        int numberOfPennies=2;

        int total= numberOfQuarters*25+numberOfDimes*10+
                numberOfNickels*5+numberOfPennies*1;

        double totalDollars=total/100.0;

        System.out.println("this will represent $"+totalDollars);


    }
}
