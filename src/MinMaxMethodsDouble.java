import java.util.Scanner; // import the Scanner class
public class MinMaxMethodsDouble {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in); // create a scanner object

        // ask user to input three numbers, read as double
        System.out.println ("Input three numbers. Use enter to key in each number.");

        //read double variables
        double numA = myObj.nextDouble();
        double numB = myObj.nextDouble();
        double numC = myObj.nextDouble();

        // check the numbers if they are integers

        if ( (numA%1 ==0) &&  (numB%1 ==0) &&  (numC%1 ==0)){

            int num1 = (int)numA; //double to integer conversion, store in  new int variables
            int num2 = (int)numB;
            int num3 = (int)numC;

            // calling minNumbers method and print the smallest number
            int minNum = minNumbers(num1, num2, num3);
            System.out.println("Smallest: " + minNum);

            // calling maxNumbers method and print the biggest number
            int maxNum = maxNumbers (num1, num2, num3);
            System.out.println ("Biggest: " +maxNum);

        }

        else {
            double minDoubleNum = minNumbers (numA, numB, numC);
            System.out.println ("Smallest: " + minDoubleNum);

            double maxDoubleNum = maxNumbers (numA, numB, numC);
            System.out.println ("Biggest: " + maxDoubleNum);
        }


    }

    public static int minNumbers(int a, int b, int c){
        int min = a;

        if (min > b){
            min = b;
        }

        if (min > c){
            min = c;
        }
        return min;
    }

    public static int maxNumbers(int a, int b, int c) {
        int max = a;

        if (max < b){
            max = b;
        }

        if (max < c){
            max = c;
        }
        return max;
    }

    public static double minNumbers(double a, double b, double c){
        double min = a;

        if (min > b){
            min = b;
        }

        if (min > c){
            min = c;
        }
        return min;
    }

    public static double maxNumbers(double a, double b, double c) {
        double max = a;

        if (max < b){
            max = b;
        }

        if (max < c){
            max = c;
        }
        return max;
    }


}
