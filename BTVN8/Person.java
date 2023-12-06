package baitapvenha8;

public abstract class Person implements Displayable{
    protected   static int count ;
    protected int id ;
    protected   String name ;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count= count;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Person(){}

    public Person( String name) {
        id = count ;
        count++;
        this.name = name;
    }
}
