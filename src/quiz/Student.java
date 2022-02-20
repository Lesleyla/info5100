package quiz;

public class Student extends Person{

    public Student(String name, int ID, int age) {
        super(name, ID, age);
    }

    public String takeQuiz(String quiz) {
        return "the student" +this.getName()+"need to take quiz"+quiz;
    }
}
