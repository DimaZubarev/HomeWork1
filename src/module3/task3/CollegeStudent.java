package module3.task3;


public class CollegeStudent extends Student {
    private String collegeName;
    private int rating;
    private long id;

    public CollegeStudent(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public CollegeStudent(int group, int age, Course[] coursesTaken) {
        super(group, age, coursesTaken);
    }

    public CollegeStudent(String firstName, String lastName, int group, int age, Course[] coursesTaken, String collegeName, int rating, long id) {
        super(group, age, coursesTaken);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }


    public String getCollegeName() {
        return collegeName;
    }


    public int getRating() {
        return rating;
    }

    public long getId() {
        return id;
    }




}



