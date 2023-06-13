package project_1;

public class Task2 {

    public static void main(String[] args) {

        /*
        Write a Java program that converts minutes into number of years and days

        example:
        int num = dynamic number
        hint: use % modulus
        example -> in the console it should print as 15000 is 6 years and 6 days

        3456789 minutes = 6 years 210 days

        1 hour = 60 minutes
        1 day = 24 hour = 1440 minutes(24 * 60)
        1 year = 365 days = 8760 hour(24 * 365) = 525600 (8760 * 60) minutes


        3456789/525600= 6 years

        3456789%525600= X minutes(210 days)


         */

        int oneHour=60;
        int oneDay=1440;
        int oneYear=525600;


        int minutes = 150000;//minutes to years and days

        int years= minutes/oneYear;//3,456,789 / 525600 = 6 years
                                    // 6 years= 3,153,600 minutes

        int minutesRemainder=minutes%oneYear;//3456789 % 525600 = 303189 minutes


        int days =minutesRemainder/oneDay;//303189 / 1440 = 210 days

        System.out.println(minutes+" minutes is equal to "+years+" years and "+days+" days");


        System.out.println(10/3);//3+3+3=9+1=10


        System.out.println(111%3);


    }
}
