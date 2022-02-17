package assignment2.question3;

public class Shape {
    String name;
    double area;
    double perimeter;

    public Shape() {
        name = "undetermined";
        area = perimeter = 0;
    }
    public void display() {
        System.out.println("Type: " + name);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

}
