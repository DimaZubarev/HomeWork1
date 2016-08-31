package module3.task3;

import java.util.Date;
import java.util.jar.Attributes;

public class Course {
    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    public Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    public Course(int hoursDuration, String teacherName) {
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public String getName() {
        return name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setStartDate(Date startDate) {this.startDate = startDate;}

    public void setName(String name) {this.name = name;}

    public void setHoursDuration(int hoursDuration) {this.hoursDuration = hoursDuration;}

    public void setTeacherName(String teacherName) {this.teacherName = teacherName;}

    Date date = new Date ();

    //Course course = new Course();







}
