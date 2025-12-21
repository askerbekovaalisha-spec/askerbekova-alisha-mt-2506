public class Human {
    private int age;
    private String name;
    private boolean Alive;

    public Human(int age, String name, boolean Alive) {
        this.age = age;
        this.name = name;
        this.Alive = Alive;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void introduce() {
        System.out.println("My name is " + name + ", age: " + age);
    }

    public String getRole() {
        return "I am human";
    }
}

