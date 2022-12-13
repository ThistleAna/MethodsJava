public class Recursion {
    public static void main(String[] args) {
    // call the method Fibonacci() to print the sequence below the bound values
        Fibonacci(30);
        // call the method, set the bound to 100
        Fibonacci(100);
        Fibonacci (300);
    }

    // method to print Fibonacci numbers
    public static void Fibonacci (int bound) { //  bound is the boundary
        int num1 = 0;
        int num2 = 1;

        int nextNum = num1 + num2;

        System.out.print(num1 + " " + num2);

        while (nextNum < bound ) { // checking if the number in the sequence is less than boundary (bound)
            System.out.print(" " + nextNum);
            // update the values of num1 and num2 and nextNum
            num1 = num2;
            num2 = nextNum;
            nextNum = num1 + num2;
        }
        System.out.println();
    }
}
