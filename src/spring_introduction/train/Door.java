package spring_introduction.train;

public class Door {
    private String material;

    public Door(String material) {
        this.material = material;
    }
    public Door() {
    }
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Door{" +
                "material='" + material + '\'' +
                '}';
    }
}
