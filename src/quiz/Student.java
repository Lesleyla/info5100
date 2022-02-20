package quiz;

public class Student extends Person{

    public Student(String name, int ID, int age) {
        super(name, ID, age);
    }

    public String takeQuiz(String quiz1) {
        return "the student need to take quiz.";
    }
}
