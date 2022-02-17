package assignment2.question3;

public class Circle extends Shape {
    private double radius;
    final double pi = Math.PI;

    public Circle() {
        this.name = "Rectangle";
        radius = 0;
    }

    public Circle(double r) {
        this.name = "Circle";
        this.radius = r;
    }

    public void computePerimeter() {
        perimeter = 2 * pi * radius;
    }

    public void computeArea() {
        area = pi * Math.pow(radius, 2);
    }
}
