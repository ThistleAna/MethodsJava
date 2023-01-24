import java.math.BigInteger;

public class FibonacciProblem {
    // create your main method
    public static void main(String[] args) {
        fibonacci(100); // you can increase gradually : 50, then 100
    }

    // create your fibonacci() method, pass on int counter
    // inside the method compute the sequence until it hits the end of the counter
    public static void fibonacci(long counter){ // 0 1 1 2 3 ...
        BigInteger num1= BigInteger.ZERO; // calling method zero from BigInteger class
        BigInteger num2= BigInteger.ONE;
        BigInteger nextNum = BigInteger.ZERO;

        System.out.println(num1 + "\n" + num2 + " ");
        // loop though until the counter end
        for (int i=0; i<counter-2; i++) {
            nextNum = num1.add(num2); // get the next number on the sequence
            System.out.println(nextNum + " ");
            num1 =num2; // update num1 and num2, move to the next sequence
            num2 = nextNum;
        }

    }
}
