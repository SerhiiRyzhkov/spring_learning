package spring_introduction.train;

public class Wall {
    private String surface;

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public Wall(String surface) {
        this.surface = surface;
    }
    public Wall( ) {}

    @Override
    public String toString() {
        return "Wall{" +
                "surface='" + surface + '\'' +
                '}';
    }
}
