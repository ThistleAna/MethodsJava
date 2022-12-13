public class FibonacciProblem {
    public static void main(String[] args) {
        // first 50 numbers of the Fibonacci sequence - next session
        Fibonacci(30);
        // call the method, set the bound to 100
    }

    // method to print Fibonacci numbers
    public static void Fibonacci (int bound) { //  bound is the boundary
        int num1 = 0;
        int num2 = 1;

        int nextNum = num1 + num2;

        System.out.println(0);
        System.out.println(1);

        while (nextNum < bound) { // checking if the number in the sequence is less than boundary (bound)
            System.out.println(nextNum);
            // update the values of num1 and num2 and nextNum
            num1 = num2;
            num2 = nextNum;
            nextNum = num1 + num2;
        }
    }
}
