package testjava;

public abstract class Person {
    private static int count = 1;
    private int id;
    private String name;
    private short age;
    private Address address;

    public Person(String name, short age, Address address) {
        this.id = count++;
    }

    public Person(String name, short age, Address address, int id) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.id = count++;
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

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + "Name: " + getName() + " - age: " + getAge() + " - address=" + getAddress() ;
    }

    public abstract String getCapacity();
}
