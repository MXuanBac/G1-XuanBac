package baitapvenha8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in) ;
    static University university = new University() ;
    public static void enrollStudentInCourse(){
        university.getCourse();
        System.out.printf("ID of course: ");
        int idName = sc.nextInt() ;
        System.out.printf("ID of student: ");
        int idCourse = sc.nextInt() ;
        Student student = university.findByIdStudent(idName) ;
        Course course = university.findById(idCourse) ;
        if(student != null && course != null) {
            student.enroll(course);
            System.out.println("Successful");
        }
        else{
            System.out.println("Failed");
        }
    }
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Display Students");
            System.out.println("2. Display Courses");
            System.out.println("3. Add Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Add Course");
            System.out.println("6. Remove Course");
            System.out.println("7. Enroll Student in Course");
            System.out.println("0. Exit");
            System.out.println("-------------------------------");
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: university.getStudents();
                    break;
                case 2: university.getCourse();
                    break;
                case 3: university.addStudent();
                    break;
                case 4: university.removeStudent();
                    break;
                case 5: university.addCourse();
                    break;
                case 6: university.removeCourse();
                    break;
                case 7: enrollStudentInCourse();
            }
        } while (choice != 0);
    }
}
