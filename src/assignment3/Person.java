package assignment3;

public class Person {
    private String name;
    private int age;
    private SeattlePoliceDepartment notification = new SeattlePoliceDepartment();

    public Person(String name, int age){
        super();
        this.name = name;
        this.age = age;
    }

    public void getNotification() {
        System.out.println("Dear " + name + ", hear is notification from Seattle Police Department: Stay safe!");
    }

    //SPD = SeattlePoliceDepartment
    public void subscribeSPD(SeattlePoliceDepartment note) {
        notification = note;
    }
}