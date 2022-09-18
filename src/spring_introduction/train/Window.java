package spring_introduction.train;

public class Window {
    private int size;
    private String color;

    public Window() {
      
    }

    public Window(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Window{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
