package spring_introduction.train;

public class House {
    private int number;
    private Wall wall;
    private Window window;
    private Door door;

    public House(int number, Wall wall, Window window, Door door) {
        this.number = number;
        this.wall = wall;
        this.window = window;
        this.door = door;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Wall getWall() {
        return wall;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    @Override
    public String toString() {
        return "House{" +
                "number=" + number +
                '}';
    }
}
