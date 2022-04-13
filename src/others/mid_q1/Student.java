package others.mid_q1;
//Create a class of Student and demonstrate shallow copy vs deep copy for student class.
//Student class will have members as name, studentID, gpa  write getters and setters for the members
public class Student {
    private String name;
    private int studentID;
    private double gpa;

    public Student() {
        //default constructor
    }
    // constructor
    public Student(String name, int studentID, double gpa) {
        this.name = name;
        this.studentID = studentID;
        this.gpa = gpa;
    }
    //deep copy
    public Student(Student student) {
        Student stu = new Student();
        this.name = student.name;;
        this.studentID = student.studentID;
        this.gpa = student.gpa;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}
