package others.mid_q3;

public class Main {
    //Write a main() method that creates a psychiatrist object and 2 moody objects.
    //The psychiatrist object will examine and observe each
    public static void main(String[] args) {
        Psychiatrist psychiatrist = new Psychiatrist();

        Moody mood1 = new Happy();
        Moody mood2 = new Sad();

        psychiatrist.examine(mood1);
        psychiatrist.observe(mood1);
        System.out.println(psychiatrist.toString(mood1));

        psychiatrist.examine(mood2);
        psychiatrist.observe(mood2);
        System.out.println(psychiatrist.toString(mood2));
    }
}
