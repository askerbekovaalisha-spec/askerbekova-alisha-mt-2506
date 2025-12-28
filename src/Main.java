import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IWork worker = new Employee(19, " Ali", true, "Worker", 89.3F);
        IRole role = new Student(45, "Alisher", false,"Student1", 67.9F);

        worker.work();
        role.study();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Is Alive? (true/false): ");
        boolean isAlive = scanner.nextBoolean();

        scanner.nextLine();

        System.out.print("Enter your oop: ");
        String oop = scanner.nextLine();


        System.out.print("Enter your gpa:");
        float gpa= scanner.nextFloat();

        Human human = new Student(age, name, isAlive, oop, gpa);

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
        System.out.println(role.getRole());

        employee.introduce();
        System.out.println(employee.getRole());
        System.out.println("Company: " + Employee.companyName);

        student.introduce();
        System.out.println(student.getRole());

        scanner.close();
    }
}