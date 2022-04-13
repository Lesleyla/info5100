package others.mid_q1;

public class Main {
    Student s1 = new Student("Lesley", 1010, 3.80);

    // Deep copy
    Student s2 = new Student(s1);

    // Shallow copy
    Student s3 = s1;
}
