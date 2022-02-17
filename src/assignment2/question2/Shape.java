package assignment2.question2;

public abstract class Shape {

    private String name;
    private String color;
    private double area;
    private double perimeter;

    public Shape (String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Shape (String name, String color, double area, double perimeter) {
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }
    public Shape(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void printShape() {
        System.out.println("name: "+getName());
        System.out.print(" color: " +getColor());
        System.out.print(" area: " + getArea());
        System.out.println(" perimeter: " + getPerimeter());
    }

}

