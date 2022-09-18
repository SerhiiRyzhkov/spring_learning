package spring_introduction.train;

public class Cat implements Pet{
    private String name;
    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
