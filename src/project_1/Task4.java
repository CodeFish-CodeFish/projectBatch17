package project_1;

public class Task4 {
    public static void main(String[] args) {
        /*
        Write  a Java program that will take a given amount of
        money and return the number of dollars in quarters, dimes,
        nickels, and pennies.

    $2.36 = should print number of quarters dimes, nickels, pennies
    $2.36 = 9 quarters, 1 dime, 0 nickels, and 1 pennies
         */


        int totalCents= 236;
        int totalQuarters= totalCents/25; //how many quarters we have
        System.out.println(totalQuarters);//9 quarters

        int totalDimes=totalCents%25/10; //1 dime
        System.out.println(totalDimes); //1 dime

        int totalNickels=totalCents%25%10/5;
        System.out.println(totalNickels);//0 nickels

        int totalPenny= totalCents%25%10%5/1;
        System.out.println(totalPenny);//1

        double totalDollars= totalCents/100.0;

        System.out.println( "$ " + totalDollars + " is " + totalQuarters + " quarters " + totalDimes + " dimes " + totalNickels + " nickels " + totalPenny + " Pennies");

        System.out.println();
    }
}
