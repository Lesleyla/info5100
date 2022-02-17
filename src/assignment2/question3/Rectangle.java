package assignment2.question3;

public class Rectangle extends Shape {
    double width, length;

    public Rectangle() {
        this.name = "Rectangle";
        length = width = 0;
    }

    public Rectangle(double w, double l) {
        this.name = "Rectangle";
        this.width = w;
        this.length = l;
    }

    public void computeArea() {
        area = width * length;
    }
    public void computePerimeter() {
        perimeter = 2 * (width + length);
    }
}
