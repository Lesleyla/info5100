package Midterm.mid_question1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Lesley", 24, "1260 Republican st");

        // Deep copy
        Person person2 = new Person(person1);

        // Shallow copy
        Person person3 = person1;
    }
}
