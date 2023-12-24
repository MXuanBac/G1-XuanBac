package bai8;

import java.util.ArrayList;
import java.util.List;
public class StudentArray {
    protected List<Student> data;

    public StudentArray() {
        data = new ArrayList<>();
    }

    public StudentArray(List<Student> data) {
        this.data = data;
    }

    public List<Student> getData() {
        return data;
    }

    public void setData(List<Student> data) {
        this.data = data;
    }

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
}

