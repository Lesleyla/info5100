package Midterm.mid_question3;

public class Printer {
    /*
     * 1. Create a class
     * 2. Default constructor as private
     * 3. Create Private static instance of the class called _instance
     * 4. Create a public function which will get you instance of the Class in step 3
     * 5. Create a private static object which will be used in locking the instance
     * 6. In the function created in step 4 Lock the creation of object
     * 7. Optionally Do double locking for performance
    */
    private Printer() {};
    private static Printer _instance;
    private static Object obj = new Object();

    public static void getConnection() {
        System.out.println("Your Printer is working");
    }
    public static Printer getInstance() {
        if (_instance == null) {
            synchronized (obj) {
                if (_instance == null) {
                    _instance = new Printer();
                }
            }
        }
        return _instance;
    }

}