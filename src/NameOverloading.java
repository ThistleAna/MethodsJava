public class NameOverloading {
    public static void main(String[] args) {
        myName ("John");
        myName ("Joe");
        myName ("Andi", "Warhol");
        myName ("Ada", "Lovelace");
        // pass on Billy Joe Brown
        myName ("Billy", "Joe", "Brown");
        // pass on Olivia Scarlet Johnson
        myName ("Olivia", "Scarlet", "Johnson");
    }
    static void myName (String firstName) { // myName() passing 1 parameter
        System.out.println( firstName + " Doe");
    }

    static void myName (String firstName, String lastName) { // myName() passing 2 parameters
        System.out.println(firstName + " " + lastName);
    }
    // extension create myName() method, overload with firstName, middleName and lastName
    static void myName (String firstName, String middleName, String lastName) { // myName() passing 2 parameters
        System.out.println(firstName + " " + middleName + " " + lastName);
    }
}
