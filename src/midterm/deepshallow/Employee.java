package midterm.deepshallow;

public class Employee {
    private String name;
    private int id;
    private Department dept;

    public void setId(int id) {
        this.id = id;
    }

    public Employee(){
        name = "Sample Employee";
        id = 0;
        dept = null;
    }


    // Copy constructor
    public Employee( Employee employee){
        Employee emp = new Employee();
        this.name = employee.name;
        this.id = employee.id;
        this.dept = new Department("Sample Dept", 1);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void printEmployeeInfo(){
        System.out.println("************");
        System.out.println("Name = " + this.name);
        System.out.println("ID = " + this.id);
    }
}
