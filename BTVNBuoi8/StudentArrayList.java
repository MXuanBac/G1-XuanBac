package bai8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentArrayList extends StudentArray{

    public StudentArrayList() {
    }

    public StudentArrayList(List<Student> data) {
        super(data);
    }

    public void add(Student student) {
        data.add(student);
    }

    public void delete(Student student) {
        data.remove(student);
    }

    public void sort(Comparator<Student> comparator) {
        Collections.sort(data, comparator);
    }
}
