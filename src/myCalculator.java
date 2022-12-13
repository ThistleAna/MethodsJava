import java.util.Scanner;

public class myCalculator {
    public static void main(String[] args) { // main method
        // read two user numbers
        Scanner myCalc = new Scanner (System.in); // scanner object
        // ask the user to input two numbers to compute
        System.out.println("Input number 1 = ");
        int num1 = myCalc.nextInt();
        System.out.println("Input number 2 = ");
        int num2 = myCalc.nextInt();
        System.out.println("You have entered " + num1 + " and " + num2);
        // call the addition method
        System.out.println(num1 + "+" + num2 + "=" + plus(num1, num2));
        System.out.println(num1 + "-" + num2 + "=" + minus(num1, num2));
        System.out.println(num1 + "x" + num2 + "=" + multiplication(num1, num2));
        System.out.println(num1 + ":" + num2 + "=" + division(num1, num2));
    }

    // addition method
    public static int plus (int a, int b) { // passing parameter a and b
        return a+b;
    }

    // substraction method
    public static int minus (int a, int b) { // passing parameter a and b
        return a-b;
    }
    // multiplication method
    public static int multiplication (int a, int b) { // passing parameter a and b
        return a * b;
    }
    // division  method
    public static int division (int a, int b) {
        return a / b;
    }
}
