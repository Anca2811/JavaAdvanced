package composition;

public class Bed {
    private String brand;
    private String type;

    public Bed(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
