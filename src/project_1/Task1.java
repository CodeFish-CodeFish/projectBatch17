package project_1;

public class Task1 {

    public static void main(String [] args){
       /*
       Write a java program that reads number in inches and converts to meter.
       One inch is 0.0254 meter.
       Input Data 2000 inch
       Output Data 50.8 meters.

       In the console "inch inches -> is 50.8 meters"
        */

        int totalInch = 4000;
        double metersInInches= 0.0254;
        double total= totalInch*metersInInches;
        System.out.println( totalInch + " inches is " + total + " meters ");


    }
}
