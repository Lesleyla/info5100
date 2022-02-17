package assignment2.question2;

public class Rhombus extends Shape {
    private double diagonal1,diagonal2;

    public Rhombus(double d1, double d2) {
        super.setName("RHOMBUS");
        super.setColor("RED");
        this.diagonal1 = d1;
        this.diagonal2 = d2;
    }
    public Rhombus(double d1) {
        super.setName("RHOMBUS");
        super.setColor("RED");
        this.diagonal1 = d1;
        this.diagonal2 = d1;
    }
    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

    @Override
    public double getPerimeter() {
        return Math.sqrt(Math.pow(diagonal1,2)+Math.pow(diagonal2,2));
    }

    @Override
    public double getArea() {
        return diagonal1*diagonal2/2.0;
    }

    public void printShape() {
        System.out.println("name: "+getName());
        System.out.print(" color: " +getColor());
        System.out.print(" area: " + getArea());
        System.out.println(" perimeter: " + getPerimeter());
    }
}
