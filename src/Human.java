public abstract class Human {
    protected int age;
    protected String name;
    protected boolean alive;


    public Human(int age, String name, boolean Alive) {
        this.age = age;
        this.name = name;
        this.alive = Alive;
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

