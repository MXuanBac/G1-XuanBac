package BTVN.Bai1;

import java.util.*;
public class ClassRoom {
    static Scanner sc = new Scanner(System.in);
    private static ArrayList<Student> list = new ArrayList<>();

    static public void inputList() {
        int id;
        float gpa;
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter commune: ");
        String commune = sc.nextLine();
        System.out.print("Enter district: ");
        String district = sc.nextLine();
        System.out.print("Enter city: ");
        String city = sc.nextLine();
        do {
            System.out.print("Enter ID : ");
            id = sc.nextInt();
            sc.nextLine();
            if (isStudentIdExists(id)) {
                System.out.println("This ID is used , let's enter another ID ");
            }
        } while (isStudentIdExists(id));
        System.out.print("Enter name of class : ");
        String nameClass = sc.nextLine();
        do {
            System.out.print("Enter GPA : ");
            gpa = sc.nextFloat();
            sc.nextLine();
            if (gpa < 0 || gpa > 4) {
                    System.out.println("ERROR ! Something is wrong , GPA must few 4 and more than 0");
            }
        } while (gpa < 0 || gpa > 4);
        Student student = new Student(name, age, commune, district, city, id, nameClass, gpa);
        list.add(student);
    }
    static public void outputList() {
        System.out.printf("%-20s %-20s %-10s %-13s %-10s %-10s %-15s %-10s %-10s\n", "Name", "Age", "Commune", "District", "City", "ID", "Name Class", "GPA" ,"Note");
        for (Student x : list) {
            x.output();
        }
    }

    static public boolean isStudentIdExists(int studentId) {
        for (Student student : list) {
            if (student.getId() == studentId) {
                return true;
            }
        }
        return false;
    }

    static public void sortByGpa() {
        list.sort((o1, o2) -> {
            float val = o1.getGpa() - o2.getGpa();
            return val > 0 ? 1 : val == 0 ? 0 : -1;
        });
    }

    static public boolean removeByID(int key) {
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == key) {
                iterator.remove();
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("             MENU                ");
            System.out.println("1. Enter student information");
            System.out.println("2. Display student information");
            System.out.println("3. Sort student information by GPA");
            System.out.println("4. Remove student information by ID");
            System.out.println("5. EXIT");
            System.out.print("Choose 1 option : ");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    inputList();
                    break;
                case 2:
                    if (list.isEmpty()) {
                        System.out.println("Empty List ...");
                    } else {
                        outputList();
                    }
                    break;
                case 3:
                    sortByGpa();
                    System.out.println("List after sort by GPA :");
                    outputList();
                    break;
                case 4:
                    System.out.print("Enter student's ID you want to remove : ");
                    int key = sc.nextInt();
                    sc.nextLine();
                    boolean removed = removeByID(key);
                    if (removed) {
                        System.out.println("Found and remove successfully ! ");
                        outputList();
                    } else {
                        System.out.println("Don't have this student in list!");
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("please, Enter 1 to 5");
            }
        }

    }
}