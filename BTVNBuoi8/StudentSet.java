package bai8;

import java.util.Comparator;
import java.util.List;

public class StudentSet extends StudentArray{
    private Comparator<Student> comparator;

    public StudentSet() {
        super();
        this.comparator = Comparator.comparingDouble(Student::getGpa);
    }

    public StudentSet(List<Student> data, Comparator<Student> comparator) {
        super(data);
        this.comparator = comparator;
    }

    public Comparator<Student> getComparator() {
        return comparator;
    }

    public void setComparator(Comparator<Student> comparator) {
        this.comparator = comparator;
        data.sort(comparator);
    }

    public void insert(Student student) {
        data.add(student);
        data.sort(comparator);
    }

    public void remove(Student student) {
        data.remove(student);
        data.sort(comparator);
    }

    public boolean contain(Student student) {
        return data.contains(student);
    }

    public void sort(StudentComparator comparator) {
        data.sort((o1, o2) -> comparator.compare(o1, o2));
    }

    public void demoData(){
        data.add(new Student("Ng Van A", 18, "Ha Noi", 3.6)) ;
        data.add(new Student("Tran Thi B" , 19 , "Hai Duong" , 3.9)) ;
        data.add(new Student("Ng Thi C" , 23 , "Bac Ninh" , 3.3)) ;
        data.add(new Student("Mai Van T" , 23 , "Bac Ninh" , 3.5)) ;
        data.add(new Student("Tran Anh T" , 19 , "Bac Giang" , 3.6)) ;
    }
}
