package assignment2.question2;

public class Triangle extends Shape {

    private double base, height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle(double side) {
        super.setName("TRIANGLE");
        super.setColor("BLUE");
        this.base = side;
        this.height = 0.5*Math.sqrt(3)*side;
    }

    public Triangle(double base, double height) {
        super.setName("TRIANGLE");
        super.setColor("BLUE");
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base*height/2.0;
    }
    @Override
    public double getPerimeter() {
        return base*3;
    }

    public void printShape() {

    }
}
