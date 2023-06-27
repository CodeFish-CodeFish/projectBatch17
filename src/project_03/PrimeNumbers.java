package project_03;

public class PrimeNumbers {

    /*
    Find the prime numbers
    divisible by 1 and by itself only

    create a method, this method should find
    if the given number is prime or not, and
    return type must be boolean

    2, 3, 5, ,7,11,13,17 ....

     */
    //17
    //1*,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17*

    //count=6

    public static boolean isPrime(int number){
        int countOfDivisibleNumbers=0;

        for (int i = 1; i <=number ; i++) {
            if(number%i==0){
                countOfDivisibleNumbers++;
            }
        }

        if(countOfDivisibleNumbers==2){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int number=17;
        int number2=18;
        int number3=257;
        int number4=2557;

        System.out.println(isPrime(number));
        System.out.println(isPrime(number2));
        System.out.println(isPrime(number3));
        System.out.println(isPrime(number4));


    }
}
