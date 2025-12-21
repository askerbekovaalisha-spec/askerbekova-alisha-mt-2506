public class Employee extends Human {

    private String position;
    private float salary;

    public static String companyName = "Apple";

    public Employee(int age, String name, boolean isAlive, String position, float salary) {
        super(age, name, isAlive);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getRole() {
        return "I am an employee. My position is " + position;
    }
}