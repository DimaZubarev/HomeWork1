package module3.task3;


public class Student {
    private String firstName;
    private String lastName;
    private int group;
    private int age;
    private Course[] coursesTaken;

    public Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public Student(int age, Course[] coursesTaken) {
        this.age = age;
        this.coursesTaken = coursesTaken;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Course[] getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(Course[] coursesTaken) {
        this.coursesTaken = coursesTaken;
    }
}