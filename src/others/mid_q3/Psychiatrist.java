package others.mid_q3;

public class Psychiatrist {
    //asks moody object about its mood
    public void examine(Moody mood){
        System.out.println("How are you feeling today?");
        mood.queryMood();
    };
    //a moodyObject is observed to either laugh or cry
    public void observe(Moody mood){
        mood.ExpressFeelings();
    };
    //returns message about self: “Subject laughs a lot”
    public String toString(Moody mood){
        return "Observation: " + mood.toString();
    };
}
