package assignment2.question1;

public class Student {
    private final int rollNumber;
    private final String name;

    Student(int RollNumber, String Name) {
        this.rollNumber = RollNumber;
        this.name = Name;
    }

    //copy constructor
    public Student(Student students) {
        rollNumber = students.rollNumber;
        name = students.name;

    }

    //creating a method that returns the rollnum of students
    int printRoll() {
        return rollNumber;
    }
    //creating a method that returns the name of students
    String printName() {
        return name;
    }

    public static void main(String[] args) {
        Student student1 = new Student(101, "ABC");
        System.out.println(" Roll number of the first student: "+
                student1.printRoll());
        System.out.println(" Name of the first student: "+ student1.printName());
        Student student2 = new Student(student1);
        System.out.println(" Roll number of the second student: "+
                student2.printRoll());
        System.out.println(" Name of the second student: "+ student2.printName());
    }
}
