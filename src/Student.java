public class Student extends Human {

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
    public String getRole() {
        return "I am a student. My major is " + major;
    }
}