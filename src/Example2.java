public class Example2 {
    public static void main(String[] args) {
        myMethod ("John"); // John and Joe are the arguments
        myMethod ("Joe");


        myName ("Andi", "Warhol");
        myName ("Ada", "Lovelace");
    }

    // create new method to put the first name
    static void myMethod (String firstName) { // firstname is the parameter

        System.out.println( firstName + " Doe");
    }

    static void myName (String firstName, String lastName) {

        System.out.println(firstName + " " + lastName);
    }
}
