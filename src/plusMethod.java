public class plusMethod {
    static int plusMethod(int x, int y) { // plusMethod() passing int arguments x and y

        return x + y; // pass on x and y with integer values
    }

    static double plusMethod (double x, double y) { // plusMethod() passing double arguments x and y

        return x+y;
    }


    public static void main(String[] args) {
        int result1 = plusMethod (4, 9);  // 4+9 = 13
        int result2 = plusMethod (25, 90); // 25 + 90 = 115
        double result3 = plusMethod (12.6, 34.6); // 12.6 + 34.6 = 47.2
        // pass on the values 8 and 5, put in in variable called myNum1 and print the result

        System.out.println("Result 1 = " + result1);
        System.out.println("Result 2 = " + result2);
        System.out.println("Result 3 = " + result3);
    }
}


