package main;

import java.util.Scanner;
import java.util.ArrayList;

public class Classroom {
    protected int classid;
    protected int numberOfStudent;
    protected ArrayList<Student> listStudents = new ArrayList<Student>(numberOfStudent);
    
    Scanner sc = new Scanner(System.in);

    public Classroom() {
    }

    public Classroom(int classid, int numberOfStudent) {
        this.classid = classid;
        this.numberOfStudent = numberOfStudent;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public ArrayList<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(ArrayList<Student> listStudents) {
        this.listStudents = listStudents;
    }
    
    public void input() {
        System.out.print("Nhap ID lop hoc: ");
        this.classid = sc.nextInt();
        System.out.println("Nhap so luong sinh vien trong lop: ");
        this.numberOfStudent = sc.nextInt();
        for(int i=0; i<numberOfStudent; i++) {
            listStudents.set(i, new Student());
            listStudents.get(i).input();
        }
    }
    
    public void output() {
        System.out.println("ID lop hoc: " + classid);
        System.out.println("Tong so sinh Vien: " + numberOfStudent);
        System.out.println("Thong tin cac sinh vien trong lop hoc: ");
        for(int i=0; i<numberOfStudent; i++) {
            System.out.println();
            listStudents.get(i).output();
            System.out.println("________________________________________");
        }
    }
    
    public void searchByName (String name) {
        int check = 0;
        System.out.print("Nhap ten sinh vien can tim: ");
        name = sc.nextLine();
        
        for(int i=0; i<numberOfStudent; i++) {
            check = listStudents.get(i).name.indexOf(name);
        }
        for(int i=0; i<numberOfStudent; i++) {
            if(check != 0){
                listStudents.get(check).input();
            }
        }
    }

    void searchByName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
