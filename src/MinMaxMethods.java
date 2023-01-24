import java.util.Scanner;

/**
 * to accept the user input as double instead of int
 *
 * in the main  method : decide whether the inputs are double or integer values
 *
 * create minMethodDouble to compute three double inputs and return the min value
 * create maxMethodDouble to compute three double inputs and return the max value
 * call these methods from the main
 */

public class MinMaxMethods {
    public static void main(String[] args) { // main method
        // ask the user to enter three values, num1, num2, num3
        Scanner newObj = new Scanner(System.in);
        System.out.println("Please input 3 numbers");
        int num1 = newObj.nextInt();
        int num2 = newObj.nextInt();
        int num3 = newObj.nextInt();

        System.out.println( "You've entered : ");
        System.out.println (num1 + " " + num2 + " " + num3);

        // call min method and print the lowest value
        System.out.println("The lowest number is " + minMethod(num1,num2,num3));

        // call the max method and print the biggest value
        System.out.println("The biggest number is " + maxMethod(num1, num2, num3));
    }

    // find the min (lowest) number on this method
    static int minMethod(int a, int b, int c){ // method 1
        int min=0;
        if (a<b){
            min=a;
        }else min=b;
        if (c<min){
            min=c;
        }
        return min;

    }

    // find the max (biggest) number on this method
    static int maxMethod(int a, int b, int c){ // method 2
        int max=0;
        if (a>b){
            max=a;
        }else max=b;
        if (c>max){
            max=c;
        }
        return max;
    }

}

