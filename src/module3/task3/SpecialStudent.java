package module3.task3;


public class SpecialStudent extends CollegeStudent {
    private long secretKey;
    private String email;

    public SpecialStudent(int group, int age, Course[] coursesTaken) {
        super(group, age, coursesTaken);
    }

    public SpecialStudent(String firstName, String lastName, int group, int age, Course[] coursesTaken, String collegeName, int rating, long id) {
        super(firstName, lastName, group, age, coursesTaken, collegeName, rating, id);
    }

    public SpecialStudent(String firstName, String lastName, int group, int age, Course[] coursesTaken, String collegeName, int rating, long id, long secretKey) {
        super(firstName, lastName, group, age, coursesTaken, collegeName, rating, id);
        this.secretKey = secretKey;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


