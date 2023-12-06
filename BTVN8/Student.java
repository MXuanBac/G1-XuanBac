package baitapvenha8;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person implements Displayable{
    private int age ;
    private String grade ;
    private List<Course> courseOfStudent  = new ArrayList<>() ;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public Student(){}

    public Student(int age, String grade) {
        this.age = age;
        this.grade = grade;
    }

    public Student(String name, int age, String grade) {
        super(name);
        this.age = age;
        this.grade = grade;
    }

    public void enroll(Course course){
        System.out.println("Success");
        courseOfStudent.add(course) ;
        course.getStudents().add(new Student(this.name , this.age  , this.grade)) ;
    }

    @Override
    public String toString() {
        return "Student: ID: " + id + " -- name='" + name +
                " -- age=" + age + " -- grade='" + grade ;
    }

    @Override
    public void DisplayInfor() {
        System.out.println(toString());
        System.out.println("Course of " + "'" + name + "' is: " + courseOfStudent.size() );
        for(Course x : courseOfStudent){
            System.out.println("Course ID: " + x.getCourseId() + " -- Course name: " + x.getCourseName());
        }
    }
}
