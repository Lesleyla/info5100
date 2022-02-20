package quiz;

public class Professor extends Person{

    public Professor(String name, int ID, int age) {
        super(name, ID, age);
    }

    public String giveQuiz(String quiz) {
        return "the prof" +this.getName()+"need to give quiz"+quiz;
    }
}
