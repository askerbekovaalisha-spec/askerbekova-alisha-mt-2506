public class Student extends Human implements IRole {

    @Override
    public void study(){
        System.out.println("He is study");
    }
    private String major;
    private float GPA;
    public Student(int age, String name, boolean isAlive,
                   String major, float GPA) {
        super(age, name, isAlive);
        this.major = major;
        this.GPA = GPA;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public float getGPA() {
        return GPA;
    }
    public void setGPA(float GPA) {
        this.GPA = GPA;
    }
    @Override
    public String getRole() {
        return "I am a student. My major is " + getMajor();
    }
}
