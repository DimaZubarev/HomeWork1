package module3.task3;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Course[] courses = new Course[5];
        courses[0] = new Course(new Date(20160811), "Student1", 10, "teacher1");
        courses[1] = new Course(new Date(20160812), "Student2", 10, "teacher2");
        courses[2] = new Course(new Date(20160813), "Student3", 10, "teacher3");
        courses[3] = new Course(new Date(20160814), "Student4", 10, "teacher4");
        courses[4] = new Course(new Date(20160815), "Student5", 10, "teacher5");
        Course course1 = new Course(new Date(20160811), "Student1", 10, "teacher1");
        Course course2 = new Course(new Date(20160812), "Student2", 10, "teacher2");
        Course course3 = new Course(new Date(20160813), "Student3", 10, "teacher3");
        Course course4 = new Course(new Date(20160814), "Student4", 10, "teacher4");
        Course course5 = new Course(new Date(20160815), "Student5", 10, "teacher5");
        /*SpecialStudent sStudent1 = new SpecialStudent("FirstName1", "LastName1", 1, 21,, 1, 11, 11111, "1ads@dfa.com");
        SpecialStudent sStudent2 = new SpecialStudent("FirstName2", "LastName2", 2, 21,,"College2", 12, 11112, "2ads@dfa.com");
        SpecialStudent sStudent3 = new SpecialStudent("FirstName3", "LastName3", 3, 21,,"College3", 13, 11113, "3ads@dfa.com");
        SpecialStudent sStudent4 = new SpecialStudent("FirstName4", "LastName4", 4, 21,,"College4", 14, 11114, "4ads@dfa.com");
        SpecialStudent sStudent5 = new SpecialStudent("FirstName5", "LastName5", 5, 21,,"College5", 15, 11115, "5ads@dfa.com");*/
    }

}
