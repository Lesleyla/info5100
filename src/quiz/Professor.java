package quiz;

public class Professor extends Person{

    private String quiz;

    public Professor(String name, int ID, int age) {
        super(name, ID, age);
    }

    public void giveQuiz(String quiz) {
        this.quiz = quiz;
    }
}
