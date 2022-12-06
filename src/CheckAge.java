public class CheckAge {
    // create method to check the age of the player
    public static void checkAge(int age) {
        //body of checkAge() method
        if (age < 18) {
            System.out.println("Access denied");
        }
        else
        {
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) { // main  method
    checkAge(20);
    checkAge(18);
    checkAge(12);
    }
}
