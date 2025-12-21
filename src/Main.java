import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Is Alive? (true/false): ");
        boolean isAlive = scanner.nextBoolean();

        Human human = new Human(age, name, isAlive);

        Employee employee = new Employee(
                20,
                "Damira",
                true,
                "Cyber Security",
                240.5f
        );

        Student student = new Student(
                19,
                "Artur",
                true,
                "Software engineer",
                3.0f
        );

        human.setAge(human.getAge() + 1);
        employee.setSalary(employee.getSalary() + 500);
        student.setGPA(4.0f);

        human.introduce();
        System.out.println(human.getRole());

        employee.introduce();
        System.out.println(employee.getRole());
        System.out.println("Company: " + Employee.companyName);

        student.introduce();
        System.out.println(student.getRole());

        scanner.close();
    }
}