package testjava;

import java.util.*;
public class StudentServiceImpl implements StudentService {
    Scanner sc = new Scanner(System.in);
    static ArrayList<Student> list = new ArrayList<>();
    @Override
    public void addStudent(Student t) {
        list.add(t);
        System.out.println("Add Student Suscess full");
    }

    @Override
    public boolean deleteStudent(int id) {
        for(Student s : list) {
            if (s.getId() == id) {
                list.remove(s);
                return true;
            }
        }
        return false;
    }

    @Override
    public void searchStudent(String name) {
        for(Student s: list) {
            if (s.getName().equals(name)) {
                System.out.println(s);
                ;
            }
        }
    }

    @Override
    public void sortedStudent() {
        for (int i=0; i<list.size(); i++) {
            for(int j=i+1; j<list.size(); j++) {
                if (list.get(i).getScore() < list.get(j).getScore()) {
                    Student tmp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tmp);
                }
            }
        }
    }

    @Override
    public void showALlStudent() {
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
