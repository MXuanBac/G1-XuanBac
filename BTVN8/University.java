package baitapvenha8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class University {
    private List<Student> students ;
    private List<Course> courses ;

    public University() {
        students = new ArrayList<>() ;
        courses = new ArrayList<>() ;
    }
    Scanner scanner = new Scanner(System.in) ;

    public void getStudents(){
        for(Student x : students){
            x.DisplayInfor();
        }
    }
    public void addStudent(){
        System.out.printf("Name: ");
        String name = scanner.nextLine() ;
        System.out.printf("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine() ;
        System.out.printf("Grade: ");
        String grade = scanner.nextLine() ;
        Student s = new Student(name , age  , grade) ;
        students.add(s) ;
    }

    public void removeStudent(){
        System.out.printf("Remove student by Id: ");
        int id = scanner.nextInt();
        for(int i = 0 ; i < students.size() ; i++){
            if(students.get(i).getId()  == id) {
                students.remove(students.get(i)) ;
                System.out.println("Sucsessed");
                return;
            }
        }
        System.out.println("Failed");
    }


    public void addCourse(){
        scanner.nextLine() ;
        System.out.print("Name Course: ");
        String name = scanner.nextLine() ;
        Course c = new Course(name) ;
        courses.add(c) ;
    }

    public void getCourse(){
        for(int i = 0 ; i < courses.size() ; i++){
            System.out.println("Course ID: " + courses.get(i).getCourseId() + "Course Name: " + courses.get(i).getCourseName());
        }
    }
    public void removeCourse(){
        System.out.printf("Remove course by Id: ");
        int id = scanner.nextInt();
        for(int i = 0 ; i < courses.size() ; i++){
            if(courses.get(i).getCourseId() == id){
                System.out.println("Successful");
                courses.remove(courses.get(i)) ;
                return;
            }
        }
        System.out.println("Failed");
        return;
    }
    public Course findById(int id){
        for(Course x : courses){
            if(x.getCourseId() == id)
                return x;
        }
        return null ;
    }
    public Student findByIdStudent(int id){
        for(Student x : students){
            if(x.getId() == id)
                return x;
        }
        return null;
    }

}
