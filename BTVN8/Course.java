package baitapvenha8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course implements Displayable{
    private int courseId ;
    private static int ID ;
    private String courseName ;
    private List<Student> students ;

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Course(){
        students = new ArrayList<>() ;
    }
    public Course( String courseName) {
        students = new ArrayList<>() ;
        courseId = ID ;
        ID++ ;
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course: --CourseId : " + courseId +
                " -- courseName='" + courseName;
    }

    @Override
    public void DisplayInfor() {
        System.out.println(toString());
        for(Student x : students){
            System.out.println("ID: " + x.getId() + " -- Name: " + x.getName()
                    + " -- Age: " + x.getAge() + " -- Grade: " + x.getGrade() );
        }
    }
}