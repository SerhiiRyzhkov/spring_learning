package spring_introduction.train;

public class Employee implements Person{
    private String name;
    private String surname;
    private int age;

    private Car car;
    private Pet pet;
    private House house;

    public Employee(String name, String surname, int age, Car car, Pet pet, House house) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.car = car;
        this.pet = pet;
        this.house = house;
    }

    @Override
    public Pet getPet() {
        return pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void introduce() {
        System.out.println("Hello, my name is " + getName() + ". I am "+ getAge() + " years old");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
