public class Example4 {
    // create a method, Workbook3, no.6
    static int plus (int x) { // parameters x

        return 5 + x;
    }

    // create new method sub, return x - 2, call from the main this method where x = 10, x= 6
    static int minus (int x) {
        return x-2;
    }


    public static void main(String[] args) { // pass on x = 3, x= 10, x=30
        System.out.println(plus(3)); // 8
        System.out.println(plus(10)); // 15


        System.out.println(minus(10)); // 8
        System.out.println(minus(6)); // 4

    }
}
