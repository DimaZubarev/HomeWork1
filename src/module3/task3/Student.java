package module3.task3;


public class Student {
    private String firstName;
    private String lastName;
    private int group;
    private int age;
    private Course[] coursesTaken;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(int group, int age, Course[] coursesTaken) {
        this.group = group;
        this.age = age;
        this.coursesTaken = coursesTaken;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGroup() {return group;}

    public int getAge() {
        return age;
    }

    public Course[] getCoursesTaken() {
        return coursesTaken;
    }

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public void setGroup(int group) {this.group = group;}

    public void setAge(int age) {this.age = age;}

    public void setCoursesTaken(Course[] coursesTaken) {this.coursesTaken = coursesTaken;}
}

