package Midterm.mid_question1;

public class Person {
    //What is a Deep copy and what is a shallow copy.
    //Create a class of Person and demonstrate shallow copy vs deep copy for Person class.
    //Person class will have members as name, age, and address. write getters and setters for the members
    private String name;
    private int age;
    private String address;

    public Person() {
        //default constructor
    }
    // constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    //deep copy
    public Person(Person person) {
        Person person1 = new Person();
        this.name = person1.name;;
        this.age = person1.age;
        this.address = person1.address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
