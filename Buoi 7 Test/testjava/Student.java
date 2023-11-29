package testjava;

public class Student extends Person{
    private double score;

    public Student(String name, short age, Address address, double score) {
        super(name, age, address);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student: ID: " + getId() + "- Name: " + getName() + "- Age: " + getAge() + "- Address: " + getAddress()
                + "- score= " + getScore() + " - " + getCapacity() ;
    }

    @Override
    public String getCapacity() {
        if (score >= 9.0) {
            return "Hoc luc Xuat Sac";
        }
        else if (score >= 8.0 && score < 9.0) {
            return "Hoc luc gioi";
        }
        else if (score >=6.5 && score < 8) {
            return "Hoc luc kha";
        }
        else return "Hoc luc trung binh yeu";
    }
}
