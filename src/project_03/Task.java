package project_03;

public class Task {

    /*
        Print half Christmas tree up to given number
        If I enter 5 in the console it should be:

        1
        22
        333
        4444
        55555

        Once finished, now do the vice versa

        55555
        4444
        333
        22
        1

        Homework will be print half tree with stars *
        in the console:
        *
        **
        ***
        ****
        *****

        2)
            *
           ***
          *****
         *******
        *********
         *******
          *****
           ***
            *
     */


    public static void main(String[] args) {
        for(int i=1;i<=5;i++){//->used for number of
            // lanes and which number should be printed
            for (int j=1;j<=i;j++){//->how many numbers should be printed
                System.out.print(i);//-->prints numbers in same line
            }
            System.out.println();//-->moves output to next line
        }

        for(int i=5;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(i);//-->prints numbers in same line
            }
            System.out.println();//-->moves output to next line
        }


    }
}
