public class Example3 {
    // create a method
    static void MyMethod (String fname, int age) { // parameters fname and age
        System.out.println(fname + " is " + age);
    }

    public static void main(String[] args) {
        MyMethod ("Liam" , 5); // passing arguments
        MyMethod("Jenny", 8);
        MyMethod("Anja", 10);
    }
}
